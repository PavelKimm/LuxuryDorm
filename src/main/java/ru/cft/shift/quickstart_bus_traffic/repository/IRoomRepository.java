package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.shift.quickstart_bus_traffic.entity.RoomEntity;

@Repository
public interface IRoomRepository extends CrudRepository<RoomEntity, Long> {
    RoomEntity getRoomEntityByName(String name);
}
