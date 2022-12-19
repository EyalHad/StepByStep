package DesignPatterns.Singleton;

public class NaiveSingleton {

    /** class that implements Singleton pattern */
    private static NaiveSingleton INSTANCE;
    private static boolean initialized = false;

    private NaiveSingleton(){
        /**
         * One time initialization - can implement the init method here or just call it here
         */
    }

    private void init(){
        /**
         * The instance can be initialized here instead of the constructor
         */
//        System.out.println("init() invoked By " + Thread.currentThread().getName());
    }

    /**
     * Public method - getInstance() - return the one and only instance of the class
     * The synchronized keyword used to make the function thread safe - in order to make sure the singleton instance will be initiate once.
     */
    public static /* synchronized */ NaiveSingleton getInstance(){

//        System.out.println("getInstance() invoked By " + Thread.currentThread().getName());

        if (initialized) { // For basic understanding of the code flow - can use INSTANCE != null, and remove the boolean field from the class.
            return INSTANCE;
        }
        INSTANCE = new NaiveSingleton();
        INSTANCE.init();
        initialized = true;

        return INSTANCE;

    }
}
