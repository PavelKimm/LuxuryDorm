package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.RoomEntity;

public interface IRoomService {
    RoomEntity add(RoomEntity room);
    RoomEntity add(String name, String type);
    RoomEntity get(Long id);
}
