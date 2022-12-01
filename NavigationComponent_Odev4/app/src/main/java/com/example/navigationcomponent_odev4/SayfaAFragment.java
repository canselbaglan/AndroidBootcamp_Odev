package com.example.navigationcomponent_odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SayfaAFragment extends Fragment {
private FragmentSayfaABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentSayfaABinding.inflate(inflater ,false ,container);//hangi tasarıma bağlandığını gösteren ifade
        return binding.getRoot();
    }
}