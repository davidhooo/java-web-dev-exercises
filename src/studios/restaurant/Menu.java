package studios.restaurant;


import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

        ArrayList<String> ingredientsForDish1 = new ArrayList<String>();

        ingredientsForDish1.add("Rice");
        ingredientsForDish1.add("Chicken Breast");
        ingredientsForDish1.add("Olive Oil");
        ingredientsForDish1.add("Soy Sauce");
        ingredientsForDish1.add("Pepper");

        MenuItem dish1 = new MenuItem("Chicken Fried Rice", ingredientsForDish1, true);

        System.out.println(dish1);
        System.out.println(dish1.getName());
        System.out.println(dish1.getIngredients());
        System.out.println(dish1.getNewItem());
    }


}
