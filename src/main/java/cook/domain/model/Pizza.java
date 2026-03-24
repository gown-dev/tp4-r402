package cook.domain.model;

public class Pizza {

    private final PizzaRecipe recette;
    private int cookingTime = 0;
    private PizzaState state;

    public Pizza(final PizzaRecipe recette) {
        this.recette = recette;
        this.state = PizzaState.Prepared;
    }

    public PizzaRecipe getRecette() {
        return recette;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public PizzaState getState() {
        return state;
    }

    public void incrementCookingTime() {
        cookingTime++;

        if (cookingTime >= recette.getCookingTime()) {
            state = PizzaState.Cooked;
        } else {
            state = PizzaState.Undercooked;
        }
    }

}
