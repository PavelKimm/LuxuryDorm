package ru.cft.shift.luxury_dorm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.luxury_dorm.api.request.ChargeWalletRequest;
import ru.cft.shift.luxury_dorm.api.response.ChargeWalletResponse;
import ru.cft.shift.luxury_dorm.api.response.UserResponse;
import ru.cft.shift.luxury_dorm.service.IUserService;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService  userService;

    @RequestMapping(method = RequestMethod.GET, path = "/users/{id}", produces = "application/json")
    public UserResponse get(@PathVariable(name = "id") Long id) {
        logger.info(String.format("id = %s", id));
        return userService.get(id);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/users/{user_id}/wallet/charge",
            consumes = "application/json",
            produces = "application/json"
    ) public ChargeWalletResponse add(@RequestBody ChargeWalletRequest chargeWalletRequest) {
        return userService.charge(chargeWalletRequest);
    }
}
