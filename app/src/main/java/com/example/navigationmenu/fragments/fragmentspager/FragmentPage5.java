package com.example.navigationmenu.fragments.fragmentspager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationmenu.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPage5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPage5 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page5, container, false);
    }
}