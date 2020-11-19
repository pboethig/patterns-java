package com.designpatternslecture.state;

public class StartState implements StopWatchState {

    private StopWatch stopWatch;

    public StartState(StopWatch stopWatch) {

        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new StopState(this.stopWatch));
        System.out.println("Watch Stopped");
    }
}
