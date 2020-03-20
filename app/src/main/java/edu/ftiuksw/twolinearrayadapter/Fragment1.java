package edu.ftiuksw.twolinearrayadapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class Fragment1 extends ListFragment {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public Fragment1(){
        contacts.add(new Contact("08918938123","pratyaksa"));
        contacts.add(new Contact("07717277819","ocsa"));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactAdapter adapter = new ContactAdapter(getActivity().getApplicationContext(), contacts);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}
