package com.designpatternslecture.state;

public class StopState implements StopWatchState {

    private StopWatch stopWatch;

    public StopState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        this.stopWatch.setCurrentState(new StartState(this.stopWatch));
        System.out.println("Watch started");
    }
}