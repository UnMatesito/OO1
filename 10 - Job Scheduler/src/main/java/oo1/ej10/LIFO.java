package oo1.ej10;

public class LIFO extends JobScheduler{

    @Override
    public JobDescription next() {
        JobDescription nextJob = jobs.getLast();
        this.unschedule(nextJob);
        return nextJob;
    }
}
