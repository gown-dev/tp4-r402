package cook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cook.domain.model.Pizza;
import cook.domain.model.PizzaRecipe;
import cook.domain.model.PizzaState;
import cook.domain.services.Pizzaiolo;

public class PizzeriaTests {

    @Test
    void should_prepare_a_queen_pizza() {
        final Pizzaiolo pizzaiolo = new Pizzaiolo();
        final Pizza queen = pizzaiolo.preparePizza(PizzaRecipe.Queen);
        assertEquals(PizzaRecipe.Queen, queen.getRecette());
        assertEquals(PizzaState.Prepared, queen.getState());
    }

}
