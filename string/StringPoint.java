import java.util.Scanner;

class StringPoint {
    public static void main(String[] args) {
        System.out.println("Inserisci una stringa");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] result = str.split(" ");
        String f = " ";
        for (int i = 0; i < result.length; i++) {
            String tmp = result[i] + '.';
            f = f + tmp;
        }
        System.out.println(f);
    }
}