package ru.cft.shift.luxury_dorm.api.response;

public class ChargeWalletResponse {
    private Long user_id;
    private Float balance;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ChargeWalletResponse{" +
                "user_id=" + user_id +
                ", balance=" + balance +
                '}';
    }
}
