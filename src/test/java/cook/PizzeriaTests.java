package cook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cook.domain.model.Pizza;
import cook.domain.model.PizzaRecipe;
import cook.domain.model.PizzaState;
import cook.domain.services.Oven;
import cook.domain.services.Pizzaiolo;
import cook.domain.tasks.schedulers.MockTickScheduler;
import cook.domain.tasks.schedulers.TickScheduler;

public class PizzeriaTests {

    @Test
    void should_prepare_a_queen_pizza() {
        final Pizzaiolo pizzaiolo = new Pizzaiolo();
        final Pizza queen = pizzaiolo.preparePizza(PizzaRecipe.Queen);
        assertEquals(PizzaRecipe.Queen, queen.getRecette());
        assertEquals(PizzaState.Prepared, queen.getState());
    }

    @Test
    void should_cook_a_queen_pizza() {
        final Pizzaiolo pizzaiolo = new Pizzaiolo();
        final Pizza queen = pizzaiolo.preparePizza(PizzaRecipe.Queen);
        final Oven oven = new Oven();
        oven.putPizza(queen);

        final TickScheduler scheduler = new MockTickScheduler(60);
        oven.setTickScheduler(scheduler);

        scheduler.start();

        assertEquals(60, queen.getCookingTime());
        assertEquals(PizzaState.Cooked, queen.getState());
    }

    @Test
    void should_undercook_a_queen_pizza() {
        final Pizzaiolo pizzaiolo = new Pizzaiolo();
        final Pizza queen = pizzaiolo.preparePizza(PizzaRecipe.Queen);
        final Oven oven = new Oven();
        oven.putPizza(queen);

        final TickScheduler scheduler = new MockTickScheduler(40);
        oven.setTickScheduler(scheduler);

        scheduler.start();

        assertEquals(40, queen.getCookingTime());
        assertEquals(PizzaState.Undercooked, queen.getState());
    }

}
