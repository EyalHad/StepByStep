package Tests.T2015A.PC;

public class Boy extends Thread {
    private Chat chat;

    public Boy(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        try {
            sleep(350);

            chat.Question("Hi Rachel");

            sleep(350);


            chat.Question("How are you?");
            sleep(350);

            chat.Question("I am also doing fine!");
            sleep(350);

            chat.Question("Surely!");
            sleep(350);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
