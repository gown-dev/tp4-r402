package cook.domain.services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import cook.domain.model.Pizza;

public class Oven {

    Map<UUID, Pizza> pizzas = new HashMap<>();

    public Oven() {

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
