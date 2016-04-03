public class CallingMethodsInSameClass {

    private static int COUNT_METHODS = 5;
    private List<Integer> list = new ArrayList<>();
    private Integer i;

    public static void main(String[] args) {
        int b = 5;
        printOne();
        printOne();
        printTwo();
    }

    public static void printOne() {
        System.out.println("Hello World");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }
}


interface IAA {
 int add(int a, int b);
 int get();
}


class CallingMethodsInSameClass1 {

    CallingMethodsInSameClass1() {
        System.out.println("Hello");
    }

    public boolean flag;

    static{
        flag = true;
    }

    public static void main(String[] args) {
        printOne();
        printOne();
        printTwo();
    }

    public static void printOne() {
        System.out.println("Hello World");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }
}