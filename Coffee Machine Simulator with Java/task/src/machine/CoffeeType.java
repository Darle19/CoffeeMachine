package machine;

public enum CoffeeType {
    ESPRESSO(new CoffeeRecipe(250, 0, 16, 4)),
    LATTE(new CoffeeRecipe(350, 75, 20, 7)),
    CAPPUCCINO(new CoffeeRecipe(200, 100, 12, 6));

    public final CoffeeRecipe recipe;

    CoffeeType(CoffeeRecipe recipe) {
        this.recipe = recipe;
    }
}
