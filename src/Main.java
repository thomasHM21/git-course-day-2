public class Main {
    public static void main(String[] args) {
        int num = 50;
        System.out.println(num);

        num = increment(num);
        System.out.printf("Increment by 1\n%d",num);
        num = decrement(num);
        System.out.printf("\nDecrement by 1\n%d",num);

    }

    public static int increment(int number){
        return ++number;
    }

    public static int decrement(int number){
        return --number;
    }
}
