package cook.domain.tasks;

import java.util.TimerTask;

import cook.domain.services.Oven;

public class IncreaseCookingTime extends TimerTask {

    private final Oven oven;

    public IncreaseCookingTime(final Oven oven) {
        this.oven = oven;
    }

    @Override
    public void run() {
        oven.incrementCookingTime();
    }

}
