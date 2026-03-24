package cook.domain.tasks.schedulers;

import cook.domain.tasks.IncreaseCookingTime;

public interface TickScheduler {

    void schedule(IncreaseCookingTime increaseCookingTime);
    void cancel();

}
