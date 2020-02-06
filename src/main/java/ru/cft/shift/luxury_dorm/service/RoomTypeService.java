package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.request.RoomTypeRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeListResponse;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeResponse;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.entity.UserEntity;
import ru.cft.shift.luxury_dorm.repository.IRoomRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomTypeRepository;
import ru.cft.shift.luxury_dorm.repository.IUserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomTypeService implements IRoomTypeService {
    @Autowired
    private IRoomTypeRepository roomTypeRepository;
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoomRepository roomRepository;

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
    public RoomIdResponse set(RoomTypeRequest roomTypeRequest)
    {
        UserEntity user = userRepository.findById(roomTypeRequest.getUser_id()).orElse(null);
        RoomTypeEntity roomTypeEntity = roomTypeRepository.findById(roomTypeRequest.getRoom_type_id()).orElse(null);
        RoomEntity roomEntity = roomRepository.getFirstByRoomType(roomTypeEntity);

        user.setBalance(user.getBalance()-roomTypeEntity.getPrice());
        user.setRoom(roomEntity);

        RoomIdResponse roomIdResponse = new RoomIdResponse();
        roomIdResponse.setRoom_id(roomEntity.getId());
        return roomIdResponse;
    }

}
