import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập a:");
        a = input.nextInt();
        System.out.println("nhập b:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 | b == 0 ){
            System.out.println("không có ước chung lớn nhất");
        }while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("ước chung lớn nhất là :"+ a);


    }
}
