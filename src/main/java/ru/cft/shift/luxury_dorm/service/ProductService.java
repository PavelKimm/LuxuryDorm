package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.response.CatalogResponse;
import ru.cft.shift.luxury_dorm.api.response.ProductResponse;
import ru.cft.shift.luxury_dorm.entity.ProductEntity;
import ru.cft.shift.luxury_dorm.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public CatalogResponse get() {
        CatalogResponse catalogResponse = new CatalogResponse();
        List<ProductResponse> productResponseList = new ArrayList<>();

        List<ProductEntity> productEntityList = productRepository.getAllBy();
        for (ProductEntity productEntity : productEntityList) {
            ProductResponse productResponse = new ProductResponse();
            productResponse.setId(productEntity.getId());
            productResponse.setName(productEntity.getName());
            productResponse.setPrice(productEntity.getPrice());
            productResponse.setCategory(productEntity.getCategory().getName());
            productResponse.setCategory_id(productEntity.getCategory().getId());
            productResponse.setDescription(productEntity.getDescription());
            productResponse.setPhoto_url(productEntity.getPhoto_url());
            productResponseList.add(productResponse);
        }
        catalogResponse.setProducts(productResponseList);

        return catalogResponse;

    }
    @Override
    public CatalogResponse get(String request) {
        CatalogResponse catalogResponse = new CatalogResponse();
        List<ProductResponse> productResponseList = new ArrayList<>();

        List<ProductEntity> productEntityList = productRepository.getAllBy().stream().filter(n -> n.getName().toLowerCase().contains(request.toLowerCase())).collect(Collectors.toList());
        for (ProductEntity productEntity : productEntityList) {
            ProductResponse productResponse = new ProductResponse();
            productResponse.setId(productEntity.getId());
            productResponse.setName(productEntity.getName());
            productResponse.setPrice(productEntity.getPrice());
            productResponse.setCategory(productEntity.getCategory().getName());
            productResponse.setCategory_id(productEntity.getCategory().getId());
            productResponse.setDescription(productEntity.getDescription());
            productResponse.setPhoto_url(productEntity.getPhoto_url());
            productResponseList.add(productResponse);
        }
        catalogResponse.setProducts(productResponseList);

        return catalogResponse;
    }
}
