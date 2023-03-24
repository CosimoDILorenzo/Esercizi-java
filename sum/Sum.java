import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        System.out.println("Inserire un numero");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum = sum + last;
            num = num / 10; 
        }
        System.out.println("La somma dei numeri è: " + sum);
    }
}