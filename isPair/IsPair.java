import java.util.Scanner;

class IsPair {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println("il numero è pari");  
        } else {
            System.out.println("Il numero è dispari");
        }
    }
}