package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.response.RoomResponse;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;

public interface IRoomService {
    RoomEntity add(RoomEntity room);
    RoomEntity add(String name, String type);
    RoomResponse get(Long id);
//    Void delete(Long productId, Long roomId, Integer count);
}
