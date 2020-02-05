package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;

public interface IRoomTypeService {
    RoomTypeEntity add(RoomTypeEntity roomType);
    RoomTypeEntity add(String name, Integer area, Integer maxProductQuantity);
    RoomTypeEntity get(Long id);
    RoomTypeEntity getByName(String name);
}
