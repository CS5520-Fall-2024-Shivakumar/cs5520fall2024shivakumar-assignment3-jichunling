package com.example.numad24fa_chunlingji;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    public TextView textName, textNumber;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        textName = itemView.findViewById(R.id.textView);
        textNumber = itemView.findViewById(R.id.textView2);
    }
}