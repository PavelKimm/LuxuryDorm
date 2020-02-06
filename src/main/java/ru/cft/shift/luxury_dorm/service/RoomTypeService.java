package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeListResponse;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeResponse;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.repository.IRoomTypeRepository;

import java.util.ArrayList;
import java.util.List;

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
    public RoomTypeResponse get(){

        RoomTypeResponse roomTypeResponse=new RoomTypeResponse();
        List<RoomTypeListResponse> RoomTypeListResponse=new ArrayList<>();
        List<RoomTypeEntity> roomTypeEntityList = (List<RoomTypeEntity>) roomTypeRepository.findAll();
        roomTypeResponse.setRoom_type_count(roomTypeEntityList.size());
        for(RoomTypeEntity roomTypeEntity:roomTypeEntityList)
        {
            RoomTypeListResponse roomTypeListResponse=new RoomTypeListResponse();
            roomTypeListResponse.setId(roomTypeEntity.getId());
            roomTypeListResponse.setName(roomTypeEntity.getName());
            roomTypeListResponse.setArea(roomTypeEntity.getArea());
            roomTypeListResponse.setMax_products(roomTypeEntity.getMaxProductQuantity());
            roomTypeListResponse.setPrice(roomTypeEntity.getPrice());
            roomTypeListResponse.setBonus(roomTypeEntity.getBonus());
            RoomTypeListResponse.add(roomTypeListResponse);
        }
        roomTypeResponse.setRoom_type(RoomTypeListResponse);
        return roomTypeResponse;
    }



    @Override
    public RoomTypeEntity getByName(String name) {
        return roomTypeRepository.getRoomTypeEntityByName(name);
    }
}
