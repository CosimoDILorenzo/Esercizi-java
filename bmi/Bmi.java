import java.util.Scanner;

class Bmi {
    public static void main(String[] args) {
        System.out.println("Indica il tuo peso");
        Scanner scan = new Scanner(System.in);
        int peso = scan.nextInt();
        System.out.println("Indica la tua altezza");
        float altezza = scan.nextFloat();
        double bmi = peso / (altezza * altezza);
        String str = Double.toString(bmi).substring(0,5);
        System.out.println(Double.parseDouble(str));
        
    }
}