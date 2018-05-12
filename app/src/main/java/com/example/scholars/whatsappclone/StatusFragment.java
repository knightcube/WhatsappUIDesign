package com.example.scholars.whatsappclone;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {

    private RecyclerView statusRecyclerView;
    private CustomStatusAdapter statusAdapter;
    private SharedPreferences prefs;
    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_status, container, false);
        prefs = getContext().getSharedPreferences("THEME_CODE", Context.MODE_PRIVATE);
        statusRecyclerView = rootView.findViewById(R.id.status_recyclerView);
        TextView myStatus = rootView.findViewById(R.id.user_name);
        if(prefs.getInt("theme_code",0)==2){
            myStatus.setTextColor(getContext().getResources().getColor(R.color.colorSelected));
        }else{
            myStatus.setTextColor(getContext().getResources().getColor(R.color.colorDarkTheme));
        }
        statusRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        statusAdapter = new CustomStatusAdapter(getContext());
        statusRecyclerView.setAdapter(statusAdapter);

        return rootView;
    }

}
