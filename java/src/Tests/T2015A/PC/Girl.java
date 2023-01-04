package Tests.T2015A.PC;

public class Girl extends Thread {
    private Chat chat;

    public Girl(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        try {

            sleep(500);

            chat.Answer("Hi Yakov");
            sleep(500);

            chat.Answer("I am good, what about you?");
            sleep(500);

            chat.Answer("See you in the evening?");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
