package desafio_guiado9;

import java.util.Scanner;

public class OnlyPrime {
    public void printFirstNPrimes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.printf("Los primeros %d números primos son:\n", n);

        int count = 0;
        int num = 2; // The first prime number
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        sc.close();
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        OnlyPrime op = new OnlyPrime();
        op.printFirstNPrimes();
    }
}
