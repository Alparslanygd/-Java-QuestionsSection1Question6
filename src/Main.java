public class Main {
    public static void main(String[] args) {
        //Write a program that displays the result of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += i + 1;
        }
        System.out.println(sum);
    }
}