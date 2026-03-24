package cook.domain.tasks;

import java.util.TimerTask;

import cook.domain.services.Oven;
import cook.domain.tasks.schedulers.TickScheduler;

public class IncreaseCookingTime extends TimerTask {

    private final Oven oven;
    private TickScheduler tickScheduler;

    public IncreaseCookingTime(final Oven oven) {
        this.oven = oven;
    }

    public void setTickScheduler(final TickScheduler tickScheduler) {
        this.tickScheduler = tickScheduler;
    }

    @Override
    public void run() {
        doIncreaseCookingTime();
    }

    private synchronized void doIncreaseCookingTime() {
        oven.incrementCookingTime();
        tickScheduler.schedule(this);
    }
}
