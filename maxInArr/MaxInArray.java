import java.util.Scanner;

class MaxInArray {
    public static void main(String[] args) {
        System.out.println("Inserire la lunghezza dell'array");
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Inserisci un numero");
            int num = scan.nextInt();
            arr[i] = num;
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("La somma dei numeri è: " + sum);
    }
}