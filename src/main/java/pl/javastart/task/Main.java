package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.withAlcohol = true;
        drink1.component1Name = "woda";
        drink1.component2Name = "sok cytrynowy";
        drink1.component3Name = "wódka";
        drink1.component1Qty = 100;
        drink1.component2Qty = 100;
        drink1.component3Qty = 40;

        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.withAlcohol);
        System.out.println("Składniki:");
        System.out.println(drink1.component1Name);
        System.out.println(drink1.component2Name);
        System.out.println(drink1.component3Name);
        int drinkCapacity = drink1.component1Qty + drink1.component2Qty + drink1.component3Qty;
        System.out.println("Pojemność: " + drinkCapacity + "ml");

    }
}
