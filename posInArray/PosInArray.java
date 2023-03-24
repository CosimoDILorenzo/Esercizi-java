import java.util.Scanner;

class PosInArray {
    public static void main(String[] args) {
        System.out.println("Inserire lunghezza array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        int max = 0;
        int position = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Inserisci un numero");
            int num = scan.nextInt();
            numbers[i] = num;
            if(numbers[i] > max) {
                max = numbers[i];
                position = i;
            }
        }
        System.out.println("Il valore massimo è : " + max + " e la sua posizione è: " + position);
    }
}