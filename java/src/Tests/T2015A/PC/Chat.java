package Tests.T2015A.PC;

public class Chat {


    private boolean turn = true;

    public synchronized void Question(String msg) {
        while (!turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        turn = false;
        notify();
    }

    public synchronized void Answer(String msg) {
        while (turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        turn = true;
        notify();
    }
}
