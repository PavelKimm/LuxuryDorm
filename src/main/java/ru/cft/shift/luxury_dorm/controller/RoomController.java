package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.luxury_dorm.api.response.RoomResponse;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;
import ru.cft.shift.luxury_dorm.service.IRoomService;

@RestController
public class RoomController {
    @Autowired
    private IRoomService roomService;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/rooms/add",
            consumes = "application/x-www-form-urlencoded",
            produces = "application/json"
    ) public RoomEntity add(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "type") String type) {
        return roomService.add(name, type);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rooms/{id}", produces = "application/json")
    public RoomResponse get(@PathVariable(name = "id") Long id) {
        return roomService.get(id);
    }
}
