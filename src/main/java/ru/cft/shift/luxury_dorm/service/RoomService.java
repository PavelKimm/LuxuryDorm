package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.response.ProductCountResponse;
import ru.cft.shift.luxury_dorm.api.response.RoomResponse;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;
import ru.cft.shift.luxury_dorm.entity.RoomProductEntity;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.repository.IRoomProductRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomTypeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private IRoomRepository roomRepository;
    @Autowired
    private IRoomTypeRepository roomTypeRepository;
    @Autowired
    private IRoomProductRepository roomProductRepository;

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
    public RoomResponse get(Long id) {
        RoomResponse roomResponse = new RoomResponse();
        List<ProductCountResponse> productCountRespons = new ArrayList<ProductCountResponse>();

        RoomEntity roomEntity = roomRepository.findById(id).orElse(null);
        roomResponse.setId(roomEntity.getId());
        roomResponse.setArea(roomEntity.getRoomType().getArea());
        roomResponse.setName(roomEntity.getName());
        roomResponse.setMax_product(roomEntity.getRoomType().getMaxProductQuantity());
        roomResponse.setRoom_type(roomEntity.getRoomType().getName());

        List<RoomProductEntity> roomProductEntityList = roomProductRepository.getAllByRoomId(id);
        roomResponse.setProduct_count(roomProductEntityList.size());
        for (RoomProductEntity roomProductEntity : roomProductEntityList){
            ProductCountResponse productCountResponse = new ProductCountResponse();
            productCountResponse.setId(roomProductEntity.getProduct().getId());
            productCountResponse.setCount(roomProductEntity.getQuantity());
            productCountResponse.setCategory(roomProductEntity.getProduct().getCategory().getName());
            productCountResponse.setCategory_id(roomProductEntity.getProduct().getCategory().getId());
            productCountResponse.setName(roomProductEntity.getProduct().getName());
            productCountResponse.setPrice(roomProductEntity.getProduct().getPrice());
            productCountResponse.setDescription(roomProductEntity.getProduct().getDescription());
            productCountRespons.add(productCountResponse);
        }
        roomResponse.setProducts(productCountRespons);

        return roomResponse;
    }

}
