package com.example.alex.allshop.presentation.di;

import com.example.alex.allshop.presentation.di.modules.AppModule;
import com.example.alex.allshop.presentation.view.mainActivity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alex on 20.12.17.
 */
@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
