import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        byte myByte = 2;
        short myShort = 327;
        int myInt = 4237;
        long myLong = 2_000_000_000L;
        float myFloat = 1.23f;
        double myDouble = 12.23;
        char myChar = '\u2245';
        boolean myBoolean = false;
        String myString = "Привет, Андрей!";


        taskTwo();
        System.out.println (taskThree());
        System.out.println(taskThreeII(10, 3));
        taskThreeIII(10, 7);
        taskFour(-5);
        System.out.println (taskFive(-8));
        System.out.println (taskSix());

    }

    public static void taskTwo() {
        float a = 1.54f;
        float b = 32.21f;
        float c = 13.1f;
        float d = 0.25f;
        float x = a * (b + (c / d));
        System.out.println(x);
    }

     public static boolean taskThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = a + b;
        boolean boolShit = c > 10 && c < 20;
            return true;
    }

    static boolean taskThreeII(int a, int b) {
        int c = a + b;
        if (c > 10 && c < 20) {
            return true;
        } else {
            return false;
        }
    }

    static void taskThreeIII(int a, int b) {
        int c = a + b;
        if (c > 10 && c < 20) {
            System.out.println("Этот курс не для новичков");
        } else {
            System.out.println("Готова поспорить");
        }
    }
static void taskFour (int a) {
        if (a>=0){
            System.out.println( "Число положительное");
        } else {
            System.out.println( "Число отрицательное");
        }
}
    static boolean taskFive (int a) {
        boolean boolAss = a>=0;
return false;
    }
    static String taskSix () {
        String myName = "Андрей";
        return "Привет," + " " + myName + "!";
    }

    }



