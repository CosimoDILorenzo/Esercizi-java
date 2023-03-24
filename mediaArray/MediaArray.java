import java.util.Scanner;

class MediaArray {
    public static void main(String[] args) {
        System.out.println("Inserire la lunghezza dell'array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Inserisci un numero");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("La media è : " + (sum / numbers.length));
    }
}