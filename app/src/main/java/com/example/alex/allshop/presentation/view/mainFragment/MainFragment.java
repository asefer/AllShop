package com.example.alex.allshop.presentation.view.mainFragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.alex.allshop.R;
import com.example.alex.allshop.models.product.Product;

/**
 * Created by alex on 12.12.17.
 */

public class MainFragment extends Fragment implements ViewMainFragment {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar=(Toolbar) view.findViewById(R.id.toolbar);
        }


        return view;
    }



    @Override
    public void showDetailContainer() {

    }

    @Override
    public void showDetail(int position, Product product) {

    }
}
