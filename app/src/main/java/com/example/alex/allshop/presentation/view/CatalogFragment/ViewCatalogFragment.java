package com.example.alex.allshop.presentation.view.CatalogFragment;

import com.arellomobile.mvp.MvpView;
import com.example.alex.allshop.models.product.Product;

public interface ViewCatalogFragment extends MvpView {
    void addProductoToBasket(Product product);

}
