package ru.cft.shift.luxury_dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
