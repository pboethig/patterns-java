package com.designpatternslecture.memento;

public class Editor {

    private String content;

    public EditorState createSate(){
        return new EditorState(this.content);
    };

    public void restore(EditorState state){
        this.content=state.getContent();
    }

    public String setContent(String content){
        return this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
