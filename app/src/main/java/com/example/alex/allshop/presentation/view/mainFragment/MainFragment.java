package com.example.alex.allshop.presentation.view.mainFragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.alex.allshop.R;
import com.example.alex.allshop.models.product.Product;
import com.example.alex.allshop.presentation.adapter.MainMenuAdapter;

import javax.inject.Inject;

/**
 * Created by alex on 12.12.17.
 */

public class MainFragment extends Fragment implements ViewMainFragment {
    @Inject
    public Context context;
    private RecyclerView mainMenu;
    private RecyclerView.Adapter mainMenuAdapter;
    private RecyclerView.LayoutManager mainMenuLayoutManager;

    private String[] menuItem=new String[]{
            "Каталог",
            "Новинки",
            "Популярное"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);

        mainMenu=(RecyclerView)view.findViewById(R.id.main_menu);
        mainMenu.setHasFixedSize(true);
        mainMenuLayoutManager=new LinearLayoutManager(context);
        mainMenu.setLayoutManager(mainMenuLayoutManager);

        mainMenuAdapter=new MainMenuAdapter(this.menuItem);
        mainMenu.setAdapter(mainMenuAdapter);
        return view;
    }



    @Override
    public void showDetailContainer() {

    }

    @Override
    public void showDetail(int position, Product product) {

    }
}
