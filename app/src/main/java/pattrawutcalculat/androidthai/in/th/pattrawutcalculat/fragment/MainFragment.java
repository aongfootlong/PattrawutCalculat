package pattrawutcalculat.androidthai.in.th.pattrawutcalculat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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


//    ShowName Controller
        showNameController();


//    Calculate Controller
        Button button = getView().findViewById(R.id.btncalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });


    }   // Main Method

    private void showNameController() {
        Button button = getView().findViewById(R.id.btnShowName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = getView().findViewById(R.id.txtShowName);
                textView.setText("AONG");

            }
        });


    }

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
