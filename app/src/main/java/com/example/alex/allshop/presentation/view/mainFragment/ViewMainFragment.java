package com.example.alex.allshop.presentation.view.mainFragment;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.example.alex.allshop.models.product.Product;

/**
 * Created by alex on 12.12.17.
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface ViewMainFragment extends MvpView {
   public void showDetailContainer();
   public void showDetail(int position, Product product);
}

