package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.RoomTypeEntity;

public interface IRoomTypeService {
    RoomTypeEntity add(RoomTypeEntity roomType);
    RoomTypeEntity add(String name, Integer area, Integer maxProductQuantity);
    RoomTypeEntity get(Long id);
    RoomTypeEntity getByName(String name);
}
