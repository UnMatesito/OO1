package oo1.ej10;

public class FIFO extends JobScheduler{

    @Override
    public JobDescription next(){
        JobDescription nextJob = jobs.removeFirst();
        this.unschedule(nextJob);
        return nextJob;
    }
}
