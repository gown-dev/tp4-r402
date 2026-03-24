package cook.domain.tasks.schedulers;

import java.util.TimerTask;

public class MockTickScheduler implements TickScheduler {

    private TimerTask task;
    private final int times;
    int count = 0;

    public MockTickScheduler(final int times) {
        this.times = times;
    }

    @Override
    public void schedule(final TimerTask task) {
        this.task = task;
    }

    @Override
    public void start() {
        while (count < times) {
            count++;
            task.run();
        }
    }

    @Override
    public void stop() {

    }

}
