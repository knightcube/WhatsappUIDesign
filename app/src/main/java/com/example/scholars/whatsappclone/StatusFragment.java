package com.example.scholars.whatsappclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {

    private RecyclerView statusRecyclerView;
    private CustomStatusAdapter statusAdapter;
    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_status, container, false);
        statusRecyclerView = rootView.findViewById(R.id.status_recyclerView);
        statusRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        blogLinks = new ArrayList<ExternalLinks>();
        statusAdapter = new CustomStatusAdapter(getContext());
        statusRecyclerView.setAdapter(statusAdapter);

        return rootView;
    }

}
