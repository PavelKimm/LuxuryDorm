package ru.cft.shift.luxury_dorm.api.response;

import java.util.List;

public class CatalogResponse {
    List<ProductResponse> products;

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CatalogResponse{" +
                "products=" + products +
                '}';
    }
}
