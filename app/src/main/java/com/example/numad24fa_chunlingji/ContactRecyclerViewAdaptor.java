package com.example.numad24fa_chunlingji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactRecyclerViewAdaptor extends RecyclerView.Adapter<ContactViewHolder> {
    Context context;
    List<ContactsModel> contactModels;
    public ContactRecyclerViewAdaptor(Context context, List<ContactsModel> contactModels) {
        this.context = context;
        this.contactModels = contactModels;
    }

    @NonNull
    @Override
    //This is where you inflate the layout (Giving a look to our rows)
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new ContactViewHolder(view) ;
    }

    @Override
    //Assigning values to the views we created in the recycler_view_row layout file
    //based on the position of the recycler view
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.textName.setText(contactModels.get(position).getContactName());
        holder.textNumber.setText(contactModels.get(position).getContactNumber());
    }

    @Override
    //The recycler view just wants to know the number of items you want displayed
    public int getItemCount() {
        return contactModels.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
