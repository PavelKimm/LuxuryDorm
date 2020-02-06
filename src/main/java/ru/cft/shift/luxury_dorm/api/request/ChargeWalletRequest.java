package ru.cft.shift.luxury_dorm.api.request;

public class ChargeWalletRequest {
    private Long user_id;
    private Float value;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChargeWalletRequest{" +
                "user_id=" + user_id +
                ", value=" + value +
                '}';
    }
}
