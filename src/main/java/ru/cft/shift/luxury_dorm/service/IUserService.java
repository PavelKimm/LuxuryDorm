package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.response.UserResponse;
import ru.cft.shift.luxury_dorm.entity.UserEntity;

public interface IUserService {
    UserResponse get(Long id);
}
