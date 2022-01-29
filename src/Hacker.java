public class Hacker {

    private double hackerMoney;

    public double getHackerMoney() {
        return hackerMoney;
    }

    public void setHackerMoney(double hackerMoney) {
        this.hackerMoney = hackerMoney;
    }

    public void stealMoney(Account myAccount) {

        double a = myAccount.getMoney();
        double x = hackerMoney;
        double z = x = a;
        myAccount.setMoney(0.00d);
        System.out.println("Баланс хакера " + hackerMoney + " руб.");
        System.out.println("Упс....");
        System.out.println("Теперь деньги у хакера и его баланс " + z + " руб.");
        System.out.println("Теперь денег у Account " + myAccount.getMoney() + " рублей");
        System.out.println("Классная задачка");

    }
 }
