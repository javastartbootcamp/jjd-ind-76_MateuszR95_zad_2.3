package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.withAlcohol = true;
        drink1.ingredient1.name = "woda";
        drink1.ingredient2.name = "sok cytrynowy";
        drink1.ingredient3.name = "wódka";
        drink1.ingredient1.quantity = 100;
        drink1.ingredient2.quantity = 80;
        drink1.ingredient3.quantity = 40;

        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.withAlcohol);
        System.out.println("Składniki: ");
        System.out.println(drink1.ingredient1.name);
        System.out.println(drink1.ingredient2.name);
        System.out.println(drink1.ingredient3.name);
        int drinkCapacity = drink1.ingredient1.quantity + drink1.ingredient2.quantity + drink1.ingredient3.quantity;
        System.out.println("Pojemność: " + drinkCapacity + "ml");

    }
}
