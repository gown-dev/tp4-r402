package cook.domain.services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import cook.domain.model.Pizza;

public class Oven {

    Map<UUID, Pizza> pizzas = new HashMap<>();

    public Oven() {

    }

    public void incrementCookingTime() {
        pizzas.values().forEach(pizza -> pizza.incrementCookingTime());
    }

}
