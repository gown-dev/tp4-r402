package cook.domain.tasks.schedulers;

import java.util.TimerTask;

public interface TickScheduler {

    void schedule(TimerTask task);

    void start();

    void stop();

}
