package entities.heranca;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account() {

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(Double depositValue) {
        this.balance += depositValue;
    }

    public void withdraw(Double withdrawValue) {
        this.balance -= withdrawValue;
    }
}
