package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.RoomEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IRoomService;

@RestController
public class RoomController {
    @Autowired
    private IRoomService roomService;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/room/add",
            consumes = "application/x-www-form-urlencoded",
            produces = "application/json"
    ) public RoomEntity add(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "type") String type) {
        return roomService.add(name, type);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/room/{id}", produces = "application/json")
    public RoomEntity get(@PathVariable(name = "id") Long id) {
        return roomService.get(id);
    }
}
