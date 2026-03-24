package cook.domain.tasks.schedulers;

import java.util.Timer;
import java.util.TimerTask;

public class RealTickScheduler implements TickScheduler {

    private final Timer timer = new Timer();
    private TimerTask task;

    @Override
    public void schedule(final TimerTask task) {
        this.task = task;
    }

    @Override
    public void start() {
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    @Override
    public void stop() {
        this.timer.cancel();
    }

}
