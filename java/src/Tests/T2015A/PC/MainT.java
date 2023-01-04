package Tests.T2015A.PC;

public class MainT {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Boy boy = new Boy(chat);
        Girl girl = new Girl(chat);
        boy.start();
        girl.start();
//        AnonimThread.threadAnonim();
    }
}
