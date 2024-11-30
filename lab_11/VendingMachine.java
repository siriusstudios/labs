public class VendingMachine {
    enum Drinks {
        COLA("Cola", 15),
        SPRITE("Sprite", 13),
        FANTA("Fanta", 16);

        private final int price;
        private final String name;

        Drinks(String name, int price) {
            this.price = price;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

    }

    enum Money {
        ONE(1),
        FIVE(5),
        TEN(10),
        FIFTEEN(15),
        FIFTY(50),
        HUNDRED(100);

        private final int banknote;

        Money(int banknote) {
            this.banknote = banknote;
        }

        public int getBanknote() {
            return this.banknote;
        }
    }

    public static void buyDrink(Drinks drink, double budget) {
        int change = (int) budget - drink.getPrice();
        Money banknote = null;
        for (Money money : Money.values()) {
            if (money.getBanknote() == change) {
                banknote = money;
            }
        }
        if (drink.getPrice() > budget) {
            System.out.println(budget + " is not enough money to buy " + drink.getName());
        } else {
            System.out.println("You bought " + drink.getName() +
                    " for " + budget
                    + ", " + "the change is "
                    + (banknote != null ? banknote.getBanknote() : 0));
        }
    }

    public static void main(String[] args) {
        /* printing the drinks */
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink.getName() + " costs " + drink.getPrice());
        }
        buyDrink(Drinks.COLA, 15);
        buyDrink(Drinks.SPRITE, 18);
        buyDrink(Drinks.COLA, 10);
    }
}
