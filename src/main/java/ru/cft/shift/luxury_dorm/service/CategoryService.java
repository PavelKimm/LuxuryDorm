package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.response.CategoryCountResponse;
import ru.cft.shift.luxury_dorm.api.response.CategoryResponse;
import ru.cft.shift.luxury_dorm.entity.CategoryEntity;
import ru.cft.shift.luxury_dorm.repository.ICategoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public CategoryCountResponse get() {
        CategoryCountResponse categoryCountResponse = new CategoryCountResponse();
        List<CategoryResponse> categoryResponseList = new ArrayList<>();

        List<CategoryEntity> categoryEntityList = categoryRepository.getAllBy();
        for (CategoryEntity categoryEntity : categoryEntityList) {
            CategoryResponse categoryResponse = new CategoryResponse();
            categoryResponse.setId(categoryEntity.getId());
            categoryResponse.setName(categoryEntity.getName());
            categoryResponseList.add(categoryResponse);
        }
        categoryCountResponse.setCategories(categoryResponseList);

        categoryCountResponse.setCategory_count(categoryEntityList.size());

        return categoryCountResponse;
    }
}
