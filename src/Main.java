import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Tổng thu nhập của bạn là: ");
            int totalIncome = scanner.nextInt();
            System.out.print("Tổng các khoản giảm trừ thuế TNCN của bạn: ");
            int taxReduction = scanner.nextInt();
            System.out.print("Tổng các khoản miễn thuế TNCN của bạn: ");
            int taxExemption = scanner.nextInt();
            System.out.print("Bạn cư trú tại Việt Nam (Y/N) ?: ");
            String buff = scanner.nextLine();
            char answer = scanner.nextLine().charAt(0);
            boolean isResident = true;
            if (answer == 'Y' || answer == 'y') {
                isResident = true;
            } else if (answer == 'N' || answer == 'n') {
                isResident = false;
            }
            System.out.print("Thời hạn hợp đồng của bạn: ");
            int laborContractTime = scanner.nextInt();
            System.out.println("-------------------Calculating----------------------");
            System.out.println("Thuế thu nhập cá nhân bạn phải nộp là: ");
            System.out.println(new Calculator().getTaxValue(totalIncome, taxReduction,
                    taxExemption, isResident, laborContractTime));
        } catch (Exception e)  {
            System.out.println("Hãy nhập đúng theo yêu cầu");
        }
    }
}
