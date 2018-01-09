package pattrawutcalculat.androidthai.in.th.pattrawutcalculat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pattrawutcalculat.androidthai.in.th.pattrawutcalculat.MainActivity;
import pattrawutcalculat.androidthai.in.th.pattrawutcalculat.R;

/**
 * Created by Pattrawut on 1/9/2018.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//    Create Toolbar
        createToolbar();


    }   // Main Method

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarMain);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);


    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewn = inflater.inflate(R.layout.fragment_main, container, false);
        return viewn;
    }
}   //Main Class
