package Tests.T2013B.PrinterStorage;



class Main { //package private class

    public static void main(String[] args) throws InterruptedException {

        Storage storage = new Storage();
        Counter producer = new Counter(storage);
        Printer consumer = new Printer(storage);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();


    }

}