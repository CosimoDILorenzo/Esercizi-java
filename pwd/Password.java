import java.util.Scanner;
class Password {

    // - scrivere un programma che prenda dal prompt una password e controlli la sua validità. La pwd è valida se:
    // - ha almeno 8 caratteri
    // - ha almento un numero
    // - ha almeno un carattere in stampatello
    // - extra: contiene un carattere speciale “!”, “£”, “$”, “%”, “&”
    public static void main(String[] args) {
        boolean firstControl = false;
        boolean secondControl = false;
        boolean thirdControl = false;
        boolean fourControl = false;

        System.out.println("Inserire una password");
        Scanner scan = new Scanner(System.in);
        String pwd = scan.nextLine();
        int leng = pwd.length();
        if(pwd.length() > 7) firstControl = true;
        for (int i = 0; i < leng; i++) {
            if(Character.isDigit(pwd.charAt(i))) secondControl = true;
            if(Character.isUpperCase(pwd.charAt(i))) thirdControl = true;
            if(String.valueOf(pwd.charAt(i)).matches("[!£$%&]")) fourControl = true;
        }
        
        if(firstControl && secondControl && thirdControl && fourControl) {
            System.out.println("Password corretta");
        } else {
            System.out.println("Password errata");
        }
        
    }
}