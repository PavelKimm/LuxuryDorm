package ru.cft.shift.luxury_dorm.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.luxury_dorm.entity.ProductEntity;

import java.util.List;

public interface IProductRepository extends CrudRepository<ProductEntity, Long> {
}
