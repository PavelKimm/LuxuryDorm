package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.shift.luxury_dorm.api.request.BuyProductRequest;
import ru.cft.shift.luxury_dorm.api.request.DeleteProductRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;
import ru.cft.shift.luxury_dorm.service.IRoomProductService;

@RestController
public class RoomProductController {
    @Autowired
    private IRoomProductService roomProductService;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/products/buy",
            consumes = "application/json",
            produces = "application/json"
    ) public RoomIdResponse buy(@RequestBody BuyProductRequest buyProductRequest) {
        return roomProductService.buy(buyProductRequest);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/products/delete",
            consumes = "application/json",
            produces = "application/json"
    ) public RoomIdResponse delete(@RequestBody DeleteProductRequest deleteProductRequest) {
        return roomProductService.delete(deleteProductRequest);
    }
}
