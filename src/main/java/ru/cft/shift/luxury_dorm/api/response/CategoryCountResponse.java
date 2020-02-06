package ru.cft.shift.luxury_dorm.api.response;

import java.util.List;

public class CategoryCountResponse {
    private Integer category_count;
    private List<CategoryResponse> categories;

    public Integer getCategory_count() {
        return category_count;
    }

    public void setCategory_count(Integer category_count) {
        this.category_count = category_count;
    }

    public List<CategoryResponse> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryResponse> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "CategoryCountResponse{" +
                "category_count=" + category_count +
                ", categories=" + categories +
                '}';
    }
}
