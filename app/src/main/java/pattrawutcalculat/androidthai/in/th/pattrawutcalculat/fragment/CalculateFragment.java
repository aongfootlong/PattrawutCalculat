package pattrawutcalculat.androidthai.in.th.pattrawutcalculat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pattrawutcalculat.androidthai.in.th.pattrawutcalculat.R;

/**
 * Created by Pattrawut on 1/9/2018.
 */

public class CalculateFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        return view;

    }

}   // Class Main
