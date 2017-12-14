package com.example.alex.allshop.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arellomobile.mvp.MvpView;
import com.example.alex.allshop.R;
import com.example.alex.allshop.models.product.Product;

import org.w3c.dom.Text;

/**
 * Created by alex on 12.12.17.
 */

public class MainFragment extends Fragment implements ViewMainFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }



    @Override
    public void showDetailContainer() {

    }

    @Override
    public void showDetail(int position, Product product) {

    }
}
