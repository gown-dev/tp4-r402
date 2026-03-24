package cook.domain.services;

import cook.domain.model.Pizza;
import cook.domain.model.PizzaRecipe;

public class Pizzaiolo {

    public Pizza preparePizza(final PizzaRecipe recipe) {
        return new Pizza(recipe);
    }

}
