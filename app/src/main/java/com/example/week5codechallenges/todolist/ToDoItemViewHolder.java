package com.example.week5codechallenges.todolist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.week5codechallenges.R;

public class ToDoItemViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextViewToDoItem;

    public ToDoItemViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextViewToDoItem = itemView.findViewById(R.id.text_view_to_do_item);
    }

    public TextView getTextViewToDoItem() {
        return mTextViewToDoItem;
    }

    public void setTextViewToDoItem(TextView textViewToDoItem) {
        mTextViewToDoItem = textViewToDoItem;
    }
}
