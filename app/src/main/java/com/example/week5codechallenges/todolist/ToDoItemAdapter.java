package com.example.week5codechallenges.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.week5codechallenges.R;

import java.util.List;

public class ToDoItemAdapter extends RecyclerView.Adapter<ToDoItemViewHolder> {
    private List<ToDoItem> mToDoItems;
    private Context mContext;

    public ToDoItemAdapter(List<ToDoItem> toDoItems, Context context) {
        mToDoItems = toDoItems;
        mContext = context;
    }

    @NonNull
    @Override
    public ToDoItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.to_do_item, viewGroup, false);
        return new ToDoItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoItemViewHolder toDoItemViewHolder, int i) {
        ToDoItem currentItem = mToDoItems.get(i);
        toDoItemViewHolder.getTextViewToDoItem().setText(currentItem.getTaskToDo());
    }

    @Override
    public int getItemCount() {
        return mToDoItems.size();
    }
}
