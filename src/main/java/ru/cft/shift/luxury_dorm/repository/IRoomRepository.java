package ru.cft.shift.luxury_dorm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;

@Repository
public interface IRoomRepository extends CrudRepository<RoomEntity, Long> {
    RoomEntity getRoomEntityByName(String name);
}
