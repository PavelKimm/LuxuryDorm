package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.luxury_dorm.api.request.ChargeWalletRequest;
import ru.cft.shift.luxury_dorm.api.response.ChargeWalletResponse;
import ru.cft.shift.luxury_dorm.api.response.UserResponse;
import ru.cft.shift.luxury_dorm.entity.UserEntity;
import ru.cft.shift.luxury_dorm.repository.IUserRepository;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserResponse get (Long id) {
        UserResponse userResponse = new UserResponse();
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        userResponse.setId(userEntity.getId());
        userResponse.setName(userEntity.getName());
        userResponse.setBalance(userEntity.getBalance());

        return  userResponse;
    }

    @Override
    public ChargeWalletResponse charge(ChargeWalletRequest chargeWalletRequest) {
        ChargeWalletResponse chargeWalletResponse = new ChargeWalletResponse();

        Long userId = chargeWalletRequest.getUser_id();
        Float value = chargeWalletRequest.getValue();

        UserEntity userEntity = userRepository.findById(userId).orElse(null);
        Float currentBalance = userEntity.getBalance();

        Float newBalance = currentBalance + value;

        userEntity.setBalance(newBalance);
        userRepository.save(userEntity);

        chargeWalletResponse.setUser_id(userId);
        chargeWalletResponse.setBalance(newBalance);

        return chargeWalletResponse;
    }
}
