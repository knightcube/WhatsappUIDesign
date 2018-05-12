package com.example.scholars.whatsappclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {
    ListView listview;
    String[] values = new String[] { "Jan",
                                    "Mark",
                                    "Jack",
                                    "Rahul",
                                    "Trivago",
                                    "Kevin",
                                    "Nikita",
                                    "Madhur",
                                    "Fred"
                                    };
    String[] chatDescription = new String[] { "Hey There! Are you using whatsapp?",
                                            "We have new updates coming up",
                                            "How is the scholarship going on?",
                                            "This morning i woke up at night",
                                            "Hotel?Trivago",
                                            "Photo",
                                            "I love this new dark mode",
                                            "Long time no see bro",
                                            "Saw that movie last night?"
    };

    String[] chatDates = new String[] { "08:58",
            "YESTERDAY",
            "05/03/2018",
            "03/03/2018",
            "27/02/2018",
            "26/02/2018",
            "24/02/2018",
            "23/02/2018",
            "26/1/2018"
    };
    private RecyclerView chatRecyclerView;
    private CustomChatRecyclerAdapter chatAdapter;
    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
        chatRecyclerView = rootView.findViewById(R.id.chat_list);
        final ArrayList<String> chatNameList = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            chatNameList.add(values[i]);
        }
        final ArrayList<String> chatDescriptionList = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            chatDescriptionList.add(chatDescription[i]);
        }
        final ArrayList<String> chatDatesList = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            chatDatesList.add(chatDates[i]);
        }
        chatRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        chatAdapter = new CustomChatRecyclerAdapter(getContext(),chatNameList,chatDescriptionList,chatDatesList);
        chatRecyclerView.setAdapter(chatAdapter);
        return rootView;
    }

}
