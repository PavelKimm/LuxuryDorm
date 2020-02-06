package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ru.cft.shift.luxury_dorm.api.request.RoomTypeRequest;
import ru.cft.shift.luxury_dorm.api.response.RoomIdResponse;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeResponse;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.service.IRoomTypeService;
import ru.cft.shift.luxury_dorm.service.RoomTypeService;

@RestController
public class RoomTypeController {
    @Autowired
    private IRoomTypeService roomTypeService;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/room_types",
            consumes = "application/json",
            produces = "application/json"
    ) public RoomIdResponse set(@RequestBody RoomTypeRequest roomTypeRequest) {
        return roomTypeService.set(roomTypeRequest);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/room_types", produces = "application/json")
    public RoomTypeResponse get() {
            return roomTypeService.get();
        }
}
