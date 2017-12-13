package com.example.alex.allshop.presentation.view.mainActivity;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Created by alex on 13.12.17.
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface ViewMainActivity extends MvpView{
}
