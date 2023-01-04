package Tests.T2013B.PrinterStorage;

class Counter implements Runnable {
    private Storage storage;
    private int count = 0;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        while (true) {
            storage.increase(count++);
            try {
                Thread.sleep(1750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
