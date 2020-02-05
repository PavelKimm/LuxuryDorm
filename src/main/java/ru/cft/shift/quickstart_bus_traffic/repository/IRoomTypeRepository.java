package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.shift.quickstart_bus_traffic.entity.RoomTypeEntity;

@Repository
public interface IRoomTypeRepository extends CrudRepository<RoomTypeEntity, Long> {
    RoomTypeEntity getRoomTypeEntityByName(String name);
}
