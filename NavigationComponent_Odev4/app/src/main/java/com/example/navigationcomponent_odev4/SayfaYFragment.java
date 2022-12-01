package com.example.navigationcomponent_odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SayfaYFragment extends Fragment {
private FragmentSayfaYbinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaYbinding .inflate(inflater, container, false);
        return binding.getRoot();
    }
}