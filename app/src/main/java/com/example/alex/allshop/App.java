package com.example.alex.allshop;

import android.app.Application;

import com.example.alex.allshop.presentation.di.AppComponent;
import com.example.alex.allshop.presentation.di.DaggerAppComponent;
import com.example.alex.allshop.presentation.di.modules.AppModule;

/**
 * Created by alex on 20.12.17.
 */

public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent(){
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component=buildComponent();
    }

    protected AppComponent buildComponent(){
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

}
