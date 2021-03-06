package ru.cft.shift.luxury_dorm.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.luxury_dorm.entity.RoomProductEntity;
import ru.cft.shift.luxury_dorm.entity.RoomProductKey;

import java.util.List;

public interface IRoomProductRepository extends CrudRepository<RoomProductEntity, Long> {
    List<RoomProductEntity> getAllByRoomId(Long id);

    RoomProductEntity getById(RoomProductKey id);
}
