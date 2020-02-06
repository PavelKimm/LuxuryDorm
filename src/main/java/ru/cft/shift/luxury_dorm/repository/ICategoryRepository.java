package ru.cft.shift.luxury_dorm.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.luxury_dorm.entity.CategoryEntity;

import java.util.List;

public interface ICategoryRepository extends CrudRepository<CategoryEntity, Long> {
    List<CategoryEntity> getAllBy();
}
