package com.example.alex.allshop.presentation.view.mainActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.alex.allshop.App;
import com.example.alex.allshop.R;
import com.example.alex.allshop.presentation.view.mainFragment.MainFragment;

public class MainActivity extends AppCompatActivity implements ViewMainActivity{



    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if (mainFragment==null){
            mainFragment=new MainFragment();
        }

        addFragment(R.id.fragment_container,mainFragment,"MainFragment");
        App.getComponent().inject(this);
    }

    private void addFragment( int containerViewId,
                               @NonNull Fragment fragment,
                               @NonNull String fragmentTag) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerViewId, fragment, fragmentTag)
                .disallowAddToBackStack()
                .commit();
    }

    private void replaceFragment(int containerViewId,
                                   @NonNull Fragment fragment,
                                   @NonNull String fragmentTag,
                                   @Nullable String backStackStateName) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerViewId, fragment, fragmentTag)
                .addToBackStack(backStackStateName)
                .commit();
    }

    private void showView(View view){
        view.setVisibility(View.VISIBLE);
    }


    private void hideView(View view){
        view.setVisibility(View.GONE);
    }
}


