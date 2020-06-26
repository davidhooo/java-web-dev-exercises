package studios.restaurant;

import java.util.ArrayList;

public class MenuItem {
    private String name;
    private ArrayList<String> ingredients;
    private Boolean newItem;

    public MenuItem(String name, ArrayList<String> ingredients, Boolean newItem) {
        this.name = name;
        this.ingredients = ingredients;
        this.newItem = newItem;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public Boolean getNewItem() {
        return this.newItem;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    protected void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
}
