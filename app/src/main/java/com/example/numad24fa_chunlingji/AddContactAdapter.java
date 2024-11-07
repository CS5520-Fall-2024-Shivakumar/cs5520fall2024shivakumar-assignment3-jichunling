package com.example.numad24fa_chunlingji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AddContactAdapter extends ArrayAdapter<ContactsModel> {
    public AddContactAdapter(@NonNull Context context, List<ContactsModel> contacts) {
        super(context, 0, contacts);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contacts_rv_item, parent, false);
        }
        ContactsModel contact = getItem(position);
        TextView name = convertView.findViewById(R.id.idTVContactName);
        //TextView phone = convertView.findViewById(R.id.contactPhone);
        assert contact != null;
        name.setText(contact.getContactName());
        //phone.setText(contact.getContactNumber());
        return convertView;
    }
}
