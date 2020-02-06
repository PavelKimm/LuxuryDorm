package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.request.RoomTypeRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.entity.UserEntity;
import ru.cft.shift.luxury_dorm.repository.IRoomRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomTypeRepository;
import ru.cft.shift.luxury_dorm.repository.IUserRepository;

@Service
public class RoomTypeService implements IRoomTypeService {
    @Autowired
    private IRoomTypeRepository roomTypeRepository;
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoomRepository roomRepository;

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
