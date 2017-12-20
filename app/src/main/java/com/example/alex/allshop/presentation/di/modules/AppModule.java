package com.example.alex.allshop.presentation.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alex on 20.12.17.
 */
@Module
public class AppModule {
    private Context context;
    public AppModule(Context context){
        this.context=context;
    }
    @Provides
    @Singleton
    public Context provideContext() {
        return this.context;
    }
}
