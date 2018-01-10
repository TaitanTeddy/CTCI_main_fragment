package com.example.teddy.ctci_main1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Teddy on 2018/1/2.
 */

public class AccumulationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return our layout file
        //change R.layout.yourlayoutfilename for each of your fragment
        return inflater.inflate(R.layout.fragment_menu_accumulation,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments titles
        getActivity().setTitle("累計圖表");
    }
}
