package cook.domain.services;

import cook.domain.tasks.schedulers.RealTickScheduler;

public class Pizzeria {

    private final Pizzaiolo pizzaiolo;
    private final Oven oven;

    public Pizzeria() {
        this.pizzaiolo = new Pizzaiolo();

        this.oven = new Oven();
        this.oven.setTickScheduler(new RealTickScheduler());
    }

}
