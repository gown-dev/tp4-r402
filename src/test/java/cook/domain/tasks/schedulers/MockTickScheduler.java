package cook.domain.tasks.schedulers;

import java.util.TimerTask;

public class MockTickScheduler implements TickScheduler {

    private final int times;
    int count = 0;

    public MockTickScheduler(final int times) {
        this.times = times;
    }

    @Override
    public void schedule(final TimerTask task) {
        while (count < times) {
            count++;
            task.run();
        }
    }

    @Override
    public void cancel() {

    }

}
