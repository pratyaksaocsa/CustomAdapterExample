package edu.ftiuksw.twolinearrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contact contact = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact, parent, false);
        }
        TextView txtNumber = convertView.findViewById(R.id.txtNumber);
        TextView txtName = convertView.findViewById(R.id.txtName);
        txtNumber.setText(contact.getNumber());
        txtName.setText(contact.getName());
        return convertView;
    }
}
