package ru.cft.shift.luxury_dorm.api.response;

import java.util.List;

public class RoomTypeResponse {
    private Integer room_type_count;
    private List<RoomTypeListResponse> room_type;

    public Integer getRoom_type_count() {
        return room_type_count;
    }

    public void setRoom_type_count(Integer room_type_count) {
        this.room_type_count = room_type_count;
    }

    public List<RoomTypeListResponse> getRoom_type() {
        return room_type;
    }

    public void setRoom_type(List<RoomTypeListResponse> room_type) {
        this.room_type = room_type;
    }


    @Override
    public String toString() {
        return "RoomTypeResponse{" +
                "room_type_count=" + room_type_count +
                ", room_type=" + room_type +
                '}';
    }
}
