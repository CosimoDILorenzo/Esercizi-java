import java.util.Scanner;

class ElementPair {
    public static void main(String[] args) {
        System.out.println("Inserire la lunghezza dell'array");
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Inserisci un numero");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        System.out.println("");
        for (int i = 1; i < numbers.length; i++) {
            if(i % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}