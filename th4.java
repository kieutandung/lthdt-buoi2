import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình tam giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
        choice = input.nextInt();
        if (choice == 1){
            System.out.println("Vẽ hình tam giác");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        } else if (choice == 2){
            System.out.println("Vẽ hình vuông");
            System.out.println("***");
            System.out.println("***");
            System.out.println("***");
        } else if (choice == 3){
            System.out.println("Vẽ hình chữ nhật");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
        } else if (choice == 0){
            System.out.println("Exiting");
            System.exit(0);
        } else {
            System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
