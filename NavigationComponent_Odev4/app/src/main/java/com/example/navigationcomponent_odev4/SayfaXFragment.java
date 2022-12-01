package com.example.navigationcomponent_odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SayfaXFragment extends Fragment {
    private FragmentSayfaXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaXBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}