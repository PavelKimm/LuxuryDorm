package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.response.ProductResponse;
import ru.cft.shift.luxury_dorm.entity.ProductEntity;
import ru.cft.shift.luxury_dorm.repository.IProductRepository;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public ProductResponse get(Long id) {
        ProductResponse productResponse = new ProductResponse();
        ProductEntity productEntity = productRepository.findById(id).orElse(null);

        productResponse.setId(productEntity.getId());
        productResponse.setCategory(productEntity.getCategory().getName());
        productResponse.setCategory_id(productEntity.getCategory().getId());
        productResponse.setName(productEntity.getName());
        productResponse.setPrice(productEntity.getPrice());
        productResponse.setDescription(productEntity.getDescription());

        return productResponse;
    }
}
