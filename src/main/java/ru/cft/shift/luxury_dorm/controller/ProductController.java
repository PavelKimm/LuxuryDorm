package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.luxury_dorm.api.response.ProductResponse;
import ru.cft.shift.luxury_dorm.service.IProductService;

@CrossOrigin(origins = "http://127.0.0.1:5005")
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping(method = RequestMethod.GET, path = "/product/{id}", produces = "application/json")
    public ProductResponse get(@PathVariable(name = "id") Long id) {
        return productService.get(id);
    }
}
