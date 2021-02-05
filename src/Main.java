public class Main {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num);

        int num2 = increment(num);
        System.out.println(num2);
        System.out.println(increment(num2));
    }

    public static int increment(int number){
        return ++number;
    }
}
