public class Bandit {
    private double stealMoney;

    public Bandit(){
    }

    public double StealMoney(double money){
        stealMoney = money;
        return 0;
    }


    public double getStealMoney() {
        return stealMoney;
    }

    public void setStealMoney(double stealMoney) {
        this.stealMoney = stealMoney;
    }
}
