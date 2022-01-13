public class Bank {
    public static void main(String[] args) {
        Account myAccount = new Account(100500);
        System.out.println("Денег на счету " + myAccount.getMoney() + " рублей");
        myAccount.setMoney(234);
        System.out.println("Теперь денег " + myAccount.getMoney() + " рублей");


    }
}
