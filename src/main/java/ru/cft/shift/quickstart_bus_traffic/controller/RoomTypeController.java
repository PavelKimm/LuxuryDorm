package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.RoomTypeEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IRoomTypeService;

@RestController
public class RoomTypeController {
    @Autowired
    private IRoomTypeService roomTypeService;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/room/type/add",
            consumes = "application/x-www-form-urlencoded",
            produces = "application/json"
    ) public RoomTypeEntity add(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "area") Integer area,
            @RequestParam(name = "maxProductQuantity") Integer maxProductQuantity) {
        return roomTypeService.add(name, area, maxProductQuantity);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/room/type", produces = "application/json")
    public RoomTypeEntity get(@RequestParam(name = "name") String name) {
        return roomTypeService.getByName(name);
    }
}
