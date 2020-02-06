package ru.cft.shift.luxury_dorm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;

import java.util.List;

@Repository
public interface IRoomTypeRepository extends CrudRepository<RoomTypeEntity, Long> {
    RoomTypeEntity getRoomTypeEntityByName(String name);
}
