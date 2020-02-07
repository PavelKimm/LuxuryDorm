package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.request.BuyProductRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;

public interface IRoomProductService {
    RoomIdResponse buy(BuyProductRequest buyProductRequest);
}
