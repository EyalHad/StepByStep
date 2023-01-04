package Exc;

public class Main {

    public static void main(String[] args) {



        Beeper b = new SimpleBeeper(); // b
        Beeper b2 = new SimpleBeeper(); // b2
        b.add(b2); // b[b2]
        b.add(new CustomBeeper("blip")); // b[b2,"blip"]
        b2.add(new CustomBeeper("bop")); // b[b2["bop"],"blip"]
        b.beep();

        /*

        CustomBeeper b = new CustomBeeper("A");
        b.add(new CustomBeeper("B")).add(new CustomBeeper("C"));
        b.beep();

        What will be the output ?

         */

        /*

        MultiBeeper mb = new MultiBeeper();
        mb = mb.add(new SimpleBeeper());
        mb.beep();

        What will be the output ?

         */

        MultiBeeper mb = new MultiBeeper();
        Beeper b123 = new MultiBeeper();
        b123 = b123.add(new SimpleBeeper());

    }
}
