package Exc;

public class CustomBeeper extends SimpleBeeper {
    private String out;
    public CustomBeeper(String out) {
        this.out = out + " ";
    }
    public void beep() {
        System.out.print(out);
    }
}
