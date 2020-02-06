package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.shift.luxury_dorm.api.response.CategoryCountResponse;
import ru.cft.shift.luxury_dorm.service.ICategoryService;

@RestController
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET, path = "/categories", produces = "application/json")
    public CategoryCountResponse get() {
        return categoryService.get();
    }
}
