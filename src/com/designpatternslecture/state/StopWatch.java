package com.designpatternslecture.state;

public class StopWatch {

    private StopWatchState currentState =new StopState(this);

    public void click(){
        this.currentState.click();
    }

    public StopWatchState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StopWatchState currentState) {
        this.currentState = currentState;
    }
}
