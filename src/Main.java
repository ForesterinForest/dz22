
public class Main {
    public static void main(String[] args) {
        int balance = 100; // баланс
        int enrollment = 2000; // сумма пополнения
        int result;
        if (enrollment > 1000) {

            result = enrollment / 100 + enrollment + balance;
            System.out.println(result);

        } else {
            result = balance + enrollment;
            System.out.println(result);
        }
    }
}