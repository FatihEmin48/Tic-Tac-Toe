package com.fatiheminkarahan.tictactoe.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fatiheminkarahan.tictactoe.MainActivity;
import com.fatiheminkarahan.tictactoe.R;

public class StartFragment extends Fragment {
    private Button btn_start;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_start, container, false);
        btn_start = view.findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                MainActivity.scoreX=0;
                MainActivity.scoreo=0;
                transaction.addToBackStack(GameFragment.TAG);
                transaction.replace(R.id.main_frame, new GameFragment());
                transaction.commit();
            }
        });
        return view;
    }
}