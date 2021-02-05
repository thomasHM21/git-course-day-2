public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        num = increment(num);
        System.out.printf("Increment number by 1\n%d",num);
        num = decrement(num);
        System.out.printf("\nDecrement number by 1\n%d",num);

    }

    public static int increment(int number){
        return ++number;
    }

    public static int decrement(int number){
        return --number;
    }
}
