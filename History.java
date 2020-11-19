package com.designpatternslecture.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> states = new ArrayList<>();

    public EditorState pop(){
        int lastIndex=states.size()-1;

        EditorState lastState = this.states.get(lastIndex);
        this.states.remove(lastState);

        return lastState;
    }

    public void push(EditorState editorState){
        this.states.add(editorState);
    }

}
