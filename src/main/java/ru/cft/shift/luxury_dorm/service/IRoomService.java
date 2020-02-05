package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.entity.RoomEntity;

public interface IRoomService {
    RoomEntity add(RoomEntity room);
    RoomEntity add(String name, String type);
    RoomEntity get(Long id);
}
