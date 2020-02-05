package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.repository.IRoomTypeRepository;

@Service
public class RoomTypeService implements IRoomTypeService {
    @Autowired
    private IRoomTypeRepository roomTypeRepository;

    @Override
    public RoomTypeEntity add(RoomTypeEntity roomType) {
        return roomTypeRepository.save(roomType);
    }
    @Override
    public RoomTypeEntity add(String name, Integer area, Integer maxProductQuantity) {
        RoomTypeEntity roomTypeEntity = new RoomTypeEntity();
        roomTypeEntity.setName(name);
        roomTypeEntity.setArea(area);
        roomTypeEntity.setMaxProductQuantity(maxProductQuantity);
        return roomTypeRepository.save(roomTypeEntity);
    }
    @Override
    public RoomTypeEntity get(Long id) {
        return roomTypeRepository.findById(id).orElse(null);
    }

    @Override
    public RoomTypeEntity getByName(String name) {
        return roomTypeRepository.getRoomTypeEntityByName(name);
    }
}
