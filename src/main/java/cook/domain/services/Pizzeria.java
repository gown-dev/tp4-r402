package cook.domain.services;

public class Pizzeria {

    private final Pizzaiolo pizzaiolo;
    private final Oven oven;

    public Pizzeria() {
        this.pizzaiolo = new Pizzaiolo();
        this.oven = new Oven();
    }

}
