package cook.domain.model;

public enum PizzaRecipe {

    Queen(60),
    Cheese(45),
    Peperoni(75);

    private int cookingTime;

    PizzaRecipe(final int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

}
