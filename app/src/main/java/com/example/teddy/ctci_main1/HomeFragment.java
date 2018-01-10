package com.example.teddy.ctci_main1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Teddy on 2018/1/2.
 */

public class HomeFragment extends Fragment {
    // a list to store all the products
    List<Product> productList;

    //the recyclerView
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return our layout file
        //change R.layout.yourlayoutfilename for each of your fragment
        return inflater.inflate(R.layout.fragment_menu_home,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments titles
        getActivity().setTitle("首頁");

        //getting the recyclerview from xml
        recyclerView = (RecyclerView)getActivity().findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        //initializing the productlist
        productList = new ArrayList<>();

        //adding some items to our list
        productList.add(
                new Product(
                        0,
                        "2018/1/4",
                        "昏迷",
                        "15:03:35",
                        "555秒",
                        2
                )
        );
        productList.add(
                new Product(
                        1,
                        "2018/1/1",
                        "跌倒",
                        "09:08:44",
                        "3秒",
                        1
                )
        );
        productList.add(
                new Product(
                        2,
                        "2018/1/1",
                        "跌倒",
                        "09:08:44",
                        "3秒",
                        1
                )
        );
        productList.add(
                new Product(
                        3,
                        "2018/1/1",
                        "跌倒",
                        "09:08:44",
                        "3秒",
                        1
                )
        );
        productList.add(
                new Product(
                        4,
                        "2018/1/1",
                        "跌倒",
                        "09:08:44",
                        "3秒",
                        1
                )
        );

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this.getContext(),productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}
