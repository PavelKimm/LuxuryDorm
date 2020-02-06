package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.luxury_dorm.api.response.CatalogResponse;
import ru.cft.shift.luxury_dorm.api.response.ProductResponse;
import ru.cft.shift.luxury_dorm.service.IProductService;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping(method = RequestMethod.GET, path = "/products/{id}", produces = "application/json")
    public ProductResponse get(@PathVariable(name = "id") Long id) {
        return productService.get(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/catalog", produces = "application/json")
    public CatalogResponse get() {
        return productService.get();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/catalog/{request}", produces = "application/json")
    public CatalogResponse get(@PathVariable(name = "request") String request) {
        return productService.get(request);
    }
}
