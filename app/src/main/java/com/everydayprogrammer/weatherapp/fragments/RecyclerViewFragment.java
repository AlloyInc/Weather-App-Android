package com.everydayprogrammer.weatherapp.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.everydayprogrammer.weatherapp.activities.MainActivity;
import com.everydayprogrammer.weatherapp.R;

public class RecyclerViewFragment extends Fragment {


    public RecyclerViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setRetainInstance(true);
        Bundle bundle = this.getArguments();
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MainActivity mainActivity = (MainActivity) getActivity();
        recyclerView.setAdapter(mainActivity.getAdapter(bundle.getInt("day")));
        return view;
    }
}