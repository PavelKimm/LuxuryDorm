package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.response.UserResponse;
import ru.cft.shift.luxury_dorm.entity.UserEntity;

public interface IUserService {
//    UserEntity add(UserEntity user);
 //   UserEntity add(String name,int balance);
    UserResponse get(Long id);

    UserEntity add(Long id, Float balance);
}
