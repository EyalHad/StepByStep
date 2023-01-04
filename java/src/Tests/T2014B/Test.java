package Tests.T2014B;

public class Test {

    public static int i = 0;

    public int aMethod() {
        return i++;
    }

    int getI(){
        return i;
    }

    public static void main(String args[]) {

//        Test test = new Test();
//        int x = test.aMethod(); // 0 + 1 = 1
//        int j =  // j = 1
//                test.aMethod(); // 1 + 1 = 2
//        System.out.println(j);
//        System.out.println(Test.i); // 2
//
//        Test test2 = new Test();
//        test2.aMethod(); // 2 + 1 = 3
//        System.out.println(Test.i); // 3

        MyCollection a1 = new MyCollection();
        MyCollection a2 = new MyCollection();
        MyCollection a3 = new MyCollection();
        MyCollection a4 = new MyCollection();


        System.out.println(MyCollection.instances);
        System.out.println(MyCollection.getInstancesNumber());
        System.out.println(a1.getInstancesNumber());

    }
}

