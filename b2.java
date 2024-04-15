import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình vuông");
            System.out.println("3. In hình tam giác vuông");
            System.out.println("4. In hình tam giác vuông ngược");
            System.out.println("5. In hình tam giác cân");
            System.out.println("6. Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int chieuDai = 6;
                    int chieuRong = 3;
                    for (int i = 0; i < chieuRong; i++) {
                        for (int j = 0; j < chieuDai; j++) {
                            System.out.print("  *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int canh = 5;

                    for (int i = 0; i < canh; i++ ){
                        for (int j = 0; j < canh; j++){
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    int chieuCao = 5;
                    for (int i = 1; i <= chieuCao; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                break;
                case 4:
                    int Chieucao = 5;
                    for (int i = 1;i >=Chieucao;i--){
                        for (int j = 1 ;j <=Chieucao;j++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    int chieucao = 5;
                    for (int i = 1;i <= chieucao; i ++) {
                        for (int j = 1; j <= chieucao - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i -1; k++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Đã chọn thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 6);
    }
}
