import java.util.Scanner;

class Palindromo {
    public static void main(String[] args) {
        System.out.println("Inserire una stringa");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--) {
            char c = str.charAt(i);
            reverse = reverse + c;

        }
        if(str.equals(reverse)) {
            System.out.println("La parola è palindroma");
        } else {
            System.out.println("Non è palindroma");
        }

    }
}