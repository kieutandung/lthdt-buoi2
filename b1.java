import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number){
            if (isPrime(N)){
                System.out.println(N+ "");
                count++;
            }
            N++;
            }
        scanner.close();
        }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
