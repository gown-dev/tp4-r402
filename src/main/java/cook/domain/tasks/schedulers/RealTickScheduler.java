package cook.domain.tasks.schedulers;

import java.util.Timer;
import java.util.TimerTask;

public class RealTickScheduler implements TickScheduler {

    private final Timer timer = new Timer();

    @Override
    public void schedule(final TimerTask task) {
        timer.schedule(task, 1000);
    }

    @Override
    public void cancel() {
        this.timer.cancel();
    }

}
