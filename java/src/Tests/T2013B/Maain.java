package Tests.T2013B;

import java.util.*;

public class Maain {

    public static void main(String[] args) {
        ContainerGen<Integer> containerGen = new ContainerGen<>();
        containerGen.add(1);
        containerGen.add(2);
        containerGen.add(5);
        containerGen.add(4);
        containerGen.add(2);
        containerGen.add(6);

        Iterator iterator = containerGen.containerIterator();
        while (true){
            System.out.println(iterator.next());
        }
    }
}
