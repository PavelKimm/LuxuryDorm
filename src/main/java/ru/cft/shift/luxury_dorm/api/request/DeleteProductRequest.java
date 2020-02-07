package ru.cft.shift.luxury_dorm.api.request;

public class DeleteProductRequest {
    private Long product_id;
    private Long room_id;
    private Long user_id;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "DeleteProductRequest{" +
                "product_id=" + product_id +
                ", room_id=" + room_id +
                ", user_id=" + user_id +
                '}';
    }
}
