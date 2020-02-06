package ru.cft.shift.luxury_dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.luxury_dorm.api.response.UserResponse;
import ru.cft.shift.luxury_dorm.entity.UserEntity;
import ru.cft.shift.luxury_dorm.service.IUserService;

@RestController
public class UserController {
    @Autowired
    private IUserService  userService;

    @RequestMapping(method = RequestMethod.GET, path = "/users/{id}", produces = "application/json")
    public UserResponse get(@PathVariable(name = "id") Long id) { return userService.get(id);
    }
}
