package com.example.week5codechallenges.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.example.week5codechallenges.R;

import java.util.ArrayList;
import java.util.List;

public class ToDoListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerViewToDoList;
    private EditText mEditTextNewTask;
    private List<ToDoItem> mToDoItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        initView();
    }

    private void initView() {
        mEditTextNewTask = findViewById(R.id.edit_text_add);
        mRecyclerViewToDoList = findViewById(R.id.recycler_view_to_do_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewToDoList.setLayoutManager(layoutManager);

        ToDoItemAdapter toDoItemAdapter = new ToDoItemAdapter(mToDoItems, this);
        mRecyclerViewToDoList.setAdapter(toDoItemAdapter);
    }

    public void addItemOnClick(View view) {
        mToDoItems.add(new ToDoItem(mEditTextNewTask.getText().toString()));
        mEditTextNewTask.setText("");
        hideKeybord(view);
    }

    public void hideKeybord(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(),
                InputMethodManager.RESULT_UNCHANGED_SHOWN);
    }
}
