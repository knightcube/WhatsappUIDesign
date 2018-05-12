package com.example.scholars.whatsappclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
//        listview = rootView.findViewById(R.id.chat_list);
//        final ArrayList<String> chatNameList = new ArrayList<String>();
//        for (int i = 0; i < values.length; ++i) {
//            chatNameList.add(values[i]);
//        }
//        final ArrayList<String> chatDescriptionList = new ArrayList<String>();
//        for (int i = 0; i < values.length; ++i) {
//            chatDescriptionList.add(chatDescription[i]);
//        }
//        final ArrayList<String> chatDatesList = new ArrayList<String>();
//        for (int i = 0; i < values.length; ++i) {
//            chatDatesList.add(chatDates[i]);
//        }
        return rootView;
    }

}
