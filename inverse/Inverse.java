import java.util.Scanner;

class Inverse {
    public static void main(String[] args) {
        System.out.println("Inserire un numero");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String res = "";
        while (num > 0) {
            int last = num % 10;
            res = res + String.valueOf(last);
            num = num / 10;
        }
        System.out.println("Il numero è: " + res);
    }
}