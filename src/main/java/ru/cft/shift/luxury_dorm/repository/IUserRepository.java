package ru.cft.shift.luxury_dorm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.shift.luxury_dorm.api.response.RoomResponse;
import ru.cft.shift.luxury_dorm.entity.RoomEntity;
import ru.cft.shift.luxury_dorm.entity.UserEntity;

@Repository


public interface IUserRepository extends CrudRepository<UserEntity, Long> {
}
