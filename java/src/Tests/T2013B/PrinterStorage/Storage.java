package Tests.T2013B.PrinterStorage;

class Storage {
    private int value = -1;
    private boolean produced = false;

    // produce
    public synchronized void increase(int value) {
        while (produced) {
            try {
                System.out.println("Counter is waiting...");
                wait();
                System.out.println("Counter is DONE waiting !");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        produced = true;
        System.out.println("Boolean value changed to true");
        notify();
        System.out.println("Counter notified");
    }


    // consume
    public synchronized int getStorageValue() {
        while (!produced) {
            try {
                System.out.println("Printer is waiting...");
                wait();
                System.out.println("Printer is DONE waiting !");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        produced = false;
        System.out.println("Boolean value changed to false");
        notify();
        System.out.println("Printer notified");
        return value;
    }
}
