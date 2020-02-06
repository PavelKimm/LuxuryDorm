package ru.cft.shift.luxury_dorm.api.response;

public class UserResponse {

    private Long id;
    private  Float balance;

    public Float getBalance() { return balance; }

    public void setBalance(Float balance) {this.balance = balance; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }


    @Override
    public String toString() {
        return "UserResponse{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }


}
