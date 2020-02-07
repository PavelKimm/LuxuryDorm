package ru.cft.shift.luxury_dorm.api.response;

public class UserFirstEnterResponse {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserFirstEnterResponse{" +
                "status='" + status + '\'' +
                '}';
    }
}
