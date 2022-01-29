public class Bank {

    public static void main(String[] args) {

        Account myAccount = new Account(100500);
        System.out.println("Денег на счету " + myAccount.getMoney() + " рублей");
        myAccount.setMoney(234);
        System.out.println("Теперь денег " + myAccount.getMoney() + " рублей");

        Bandit madDog = new Bandit();
        myAccount.setMoney(madDog.StealMoney(myAccount.getMoney()));
        System.out.println("Бешеный Пёс украл денег " + madDog.getStealMoney());
        System.out.println("Теперь в банке денег " + myAccount.getMoney());


        Hacker hacker = new Hacker();
        hacker.stealMoney(myAccount);

    }
}

