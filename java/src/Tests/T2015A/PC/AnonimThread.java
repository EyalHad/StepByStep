package Tests.T2015A.PC;

class AnonimThread {
    public static void threadAnonim() {
        Thread t = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);  // sleep for one second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();





    }
}
