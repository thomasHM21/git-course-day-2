public class Main {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num);
        System.out.println(increment(num));
    }

    public static int increment(int number){
        return ++number;
    }
}
