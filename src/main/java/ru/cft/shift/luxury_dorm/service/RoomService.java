package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.repository.IRoomRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomTypeRepository;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private IRoomRepository roomRepository;
    @Autowired
    private IRoomTypeRepository roomTypeRepository;

    @Override
    public RoomEntity add(RoomEntity roomEntity) {
        RoomTypeEntity roomTypeEntity = roomTypeRepository.getRoomTypeEntityByName("lux");
        roomEntity.setRoomType(roomTypeEntity);
        return roomRepository.save(roomEntity);
    }
    @Override
    public RoomEntity add(String name, String type) {
        RoomTypeEntity roomTypeEntity = roomTypeRepository.getRoomTypeEntityByName(type);
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setName(name);
        roomEntity.setRoomType(roomTypeEntity);
        return roomRepository.save(roomEntity);
    }
    @Override
    public RoomEntity get(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

}
