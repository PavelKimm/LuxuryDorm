package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.response.CatalogResponse;
import ru.cft.shift.luxury_dorm.api.response.ProductResponse;

public interface IProductService {
    ProductResponse get(Long id);
    CatalogResponse get();
}
