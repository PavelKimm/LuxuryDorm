package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.response.RoomTypeResponse;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;

public interface IRoomTypeService {
    RoomTypeEntity add(RoomTypeEntity roomType);
    RoomTypeEntity add(String name, Integer area, Integer maxProductQuantity);
    RoomTypeResponse get();
    RoomTypeEntity getByName(String name);
}
