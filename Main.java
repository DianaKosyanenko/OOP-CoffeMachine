public class Main {
    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        coffeMachine.addCoffe(new Coffe("Capuchino", 100, 90, 250))
                .addCoffe(new Coffe("Latte", 150, 85, 300))
                .addCoffe(new Coffe("Expresso", 90, 80, 200))
                .addCoffe(new Coffe("Mokko", 50, 90, 250))
                .addCoffe(new Coffe("Americano", 80, 80, 200));

        for (int i = 0; i < coffeMachine.getList().size(); i++) {
            System.out.println(coffeMachine.getList().get(i));

        }
        Coffe found = coffeMachine.findCoffe("Capuchino");
        System.out.println(found);
        System.out.println("Покупаем кофе");
        Coffe sold = coffeMachine.sellCoffe(found);
        System.out.println(sold);
        System.out.println("В автомате столько денег");
        System.out.println(coffeMachine.getAmount());
        System.out.println("-----------");
        for (int i = 0; i < coffeMachine.getList().size(); i++) {
            System.out.println(coffeMachine.getList().get(i));

        }

        for (int i = 0; i < coffeMachine.getList().size(); i++) {
            System.out.println(coffeMachine.getList().get(i));

        }

        Coffe latte  = coffeMachine.sellCoffe(coffeMachine.findCoffe("Latte"));
        for (int i = 0; i <coffeMachine.getList().size() ; i++) {
            System.out.println(coffeMachine.getList().get(i));

        }

        System.out.println("Денег в автомате");
        System.out.println(coffeMachine.getAmount());
        try {
            Coffe capuchino = coffeMachine.sellCoffe(coffeMachine.findCoffe("Capuchino"));
            System.out.println(capuchino);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }
}

