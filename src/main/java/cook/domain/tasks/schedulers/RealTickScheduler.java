package cook.domain.tasks.schedulers;

import java.util.Timer;

import cook.domain.tasks.IncreaseCookingTime;

public class RealTickScheduler implements TickScheduler {

    private final Timer timer = new Timer();

    @Override
    public void schedule(final IncreaseCookingTime increaseCookingTime) {
        timer.schedule(increaseCookingTime, 1000);
    }

    @Override
    public void cancel() {
        this.timer.cancel();
    }

}
