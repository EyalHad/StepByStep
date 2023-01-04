package Tests.T2013B.PrinterStorage;

class Printer implements Runnable {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        int value;
        System.out.println("Printer before while...");
        while ((value = storage.getStorageValue()) != -1) {
            System.out.println("Print from storage: " + value);
            try {
                Thread.sleep(1750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
