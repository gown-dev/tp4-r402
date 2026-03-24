package cook.domain.model;

public class Pizza {

    private final PizzaRecipe recette;
    private int cookingTime = 0;
    private final PizzaState state;

    public Pizza(final PizzaRecipe recette) {
        this.recette = recette;
        this.state = PizzaState.Prepared;
    }

    public PizzaRecipe getRecette() {
        return recette;
    }

    public PizzaState getState() {
        return state;
    }

    public void incrementCookingTime() {
        this.cookingTime++;
    }

}
