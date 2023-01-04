package Exc;

import java.util.LinkedList;
import java.util.List;

public class SimpleBeeper implements Beeper {
    private List<Beeper> l = new LinkedList<>();
    public void beep() {
        System.out.print("beep ");
        for (Beeper b : l) {
            b.beep();
        }
    }
    public Beeper add(Beeper b) {
        l.add(b);
        return this;
    }
}
