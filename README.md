### Memento
Um es einfach zu machen. Memento implementiert die Undo-Redo Funktion, wie man sie aus den besseren Clients kennt.

- Editor ist das Objekt, das State erzeugt
- EditorState ist der State des Editors :-)
- History ist dann logischerweise die Liste mit Zuständen die der Editor erzeugt hat

Im Editor wird der Content bearbeitet, diese Bearbeitung wird in der History als State abgelegt, sodass man jederzeit zu einem ursprünglicherem Zustand zurückkehren kann.



