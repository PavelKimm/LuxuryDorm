package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.request.BuyProductRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;
import ru.cft.shift.luxury_dorm.entity.*;
import ru.cft.shift.luxury_dorm.repository.IProductRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomProductRepository;
import ru.cft.shift.luxury_dorm.repository.IRoomRepository;
import ru.cft.shift.luxury_dorm.repository.IUserRepository;

@Service
public class RoomProductService implements IRoomProductService {
    @Autowired
    private IRoomProductRepository roomProductRepository;
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private IUserRepository userRepository;

    @Override
    public RoomIdResponse buy(BuyProductRequest buyProductRequest) {
        RoomIdResponse roomIdResponse = new RoomIdResponse();

        Long roomId = buyProductRequest.getRoom_id();
        Long productId = buyProductRequest.getProduct_id();
        Long userId = buyProductRequest.getUser_id();

        RoomProductKey roomProductKey = new RoomProductKey(productId, roomId);

        RoomProductEntity roomProductEntity = roomProductRepository.getById(roomProductKey);
        if (roomProductEntity == null) {
            roomProductEntity = new RoomProductEntity();
            roomProductEntity.setId(roomProductKey);
            roomProductEntity.setQuantity(0);
        }

        ProductEntity productEntity = productRepository.findById(productId).orElse(null);
        UserEntity userEntity = userRepository.findById(userId).orElse(null);

        Float userBalance = userEntity.getBalance();
        Float productPrice = productEntity.getPrice();
        userEntity.setBalance(userBalance - productPrice);

        roomProductEntity.setQuantity(roomProductEntity.getQuantity() + 1);

        roomProductRepository.save(roomProductEntity);
        userRepository.save(userEntity);
        roomIdResponse.setRoom_id(roomId);
        return roomIdResponse;
    }
}
