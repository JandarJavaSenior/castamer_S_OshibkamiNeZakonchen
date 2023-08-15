public class Bank {
    private String userName;
    private String password;
    private int totalMoney;

    public Bank(String userName, String password, int totalMoney) {
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
