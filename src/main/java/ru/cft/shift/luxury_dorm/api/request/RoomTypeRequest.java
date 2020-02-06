package ru.cft.shift.luxury_dorm.api.request;

public class RoomTypeRequest {
    private Long room_type_id;
    private Long user_id;

    public Long getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Long room_type_id) {
        this.room_type_id = room_type_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "RoomTypeRequest{" +
                "room_type_id=" + room_type_id +
                ", user_id=" + user_id +
                '}';
    }
}
