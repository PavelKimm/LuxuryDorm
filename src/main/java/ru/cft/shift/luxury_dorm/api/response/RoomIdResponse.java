package ru.cft.shift.luxury_dorm.api.response;

public class RoomIdResponse {
    private Long room_id;

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    @Override
    public String toString() {
        return "RoomIdResponse{" +
                "room_id=" + room_id +
                '}';
    }
}
