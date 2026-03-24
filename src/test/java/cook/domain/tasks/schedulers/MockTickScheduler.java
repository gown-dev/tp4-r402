package cook.domain.tasks.schedulers;

import cook.domain.tasks.IncreaseCookingTime;
import cook.domain.tasks.schedulers.TickScheduler;

public class MockTickScheduler implements TickScheduler {

    private final int times;
    int count = 0;

    public MockTickScheduler(final int times) {
        this.times = times;
    }

    @Override
    public void schedule(final IncreaseCookingTime increaseCookingTime) {
        if (count < times) {
            count++;
            increaseCookingTime.run();
        }
    }

    @Override
    public void cancel() {

    }

}
