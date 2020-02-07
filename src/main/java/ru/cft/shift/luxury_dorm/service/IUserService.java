package ru.cft.shift.luxury_dorm.service;

import ru.cft.shift.luxury_dorm.api.request.ChargeWalletRequest;
import ru.cft.shift.luxury_dorm.api.response.ChargeWalletResponse;
import ru.cft.shift.luxury_dorm.api.response.UserFirstEnterResponse;
import ru.cft.shift.luxury_dorm.api.response.UserResponse;
import ru.cft.shift.luxury_dorm.entity.UserEntity;

public interface IUserService {
    UserResponse get(Long id);
    UserFirstEnterResponse getFirstEnter(Long id);
    ChargeWalletResponse charge(ChargeWalletRequest chargeWalletRequest);

}
