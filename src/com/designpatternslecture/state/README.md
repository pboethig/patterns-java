# State-pattern
- Verhaltensmuster
- Dieses Muster versucht das Problem zu lösen, dass ein Objekt seinen Zustand ändern kann und die Zustände und der Workflow der Zustandsänderung sehr schnell sehr komplex werden können.
- Die Einzelnen Zustände werden als separate Klassen definiert und über ein ZustandsInterface vereinheitlicht.
- Die Basisklasse ändert nun nicht mehr den Zustand auf seinem Objekt selbst sondern über eine Schnittstelle

Beispiel:

```Java
        StopWatch stopWatch = new StopWatch();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
```

Die Klickmethode setzt einfach den nächsten Zustand (StartState())
Jeder Weitere Klick setzt den Zustand, der in der Click- Methode definiert ist.
