package cook.domain.services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import cook.domain.model.Pizza;
import cook.domain.tasks.IncreaseCookingTime;
import cook.domain.tasks.schedulers.TickScheduler;

public class Oven {

    private TickScheduler tickScheduler;
    private final Map<UUID, Pizza> pizzas = new HashMap<>();

    public void setTickScheduler(final TickScheduler tickScheduler) {
        this.tickScheduler = tickScheduler;
        this.tickScheduler.schedule(new IncreaseCookingTime(this));
    }

    public UUID putPizza(final Pizza pizza) {
        final UUID pizzaId = UUID.randomUUID();
        pizzas.put(pizzaId, pizza);
        return pizzaId;
    }

    public void incrementCookingTime() {
        pizzas.values().forEach(Pizza::incrementCookingTime);
    }

}
