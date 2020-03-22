import java.util.Scanner;

public class First20PrimesDisplay {
    public static void main(String[] args) {
        int count = 0;
        int index = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of primes to display: ");
        int inputAmount = scanner.nextInt();

        while (count < inputAmount) {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(index)) {
                if (index % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.print(index + " ");
                count++;
            }
            index++;
        }
    }
}

