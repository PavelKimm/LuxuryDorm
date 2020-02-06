package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.request.RoomTypeRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeResponse;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;

public interface IRoomTypeService {
    RoomTypeResponse get();
    RoomIdResponse set(RoomTypeRequest roomTypeRequest);
}
