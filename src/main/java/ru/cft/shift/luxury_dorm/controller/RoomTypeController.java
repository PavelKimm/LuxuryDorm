package ru.cft.shift.luxury_dorm.controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.luxury_dorm.api.response.RoomTypeResponse;
import ru.cft.shift.luxury_dorm.entity.RoomTypeEntity;
import ru.cft.shift.luxury_dorm.service.IRoomTypeService;
import ru.cft.shift.luxury_dorm.service.RoomService;

import java.util.List;

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

    @RequestMapping(method = RequestMethod.GET, path = "/room_types", produces = "application/json")
    public RoomTypeResponse get() {
        return roomTypeService.get();
    }
}
