import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static int deveRetorarUmInt(){
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                return Integer.parseInt(input.next());
            }catch (NumberFormatException e){
                System.err.println("Por favor digite somente numero");
            }
        }
    }

    public static String deveRetornarUmaString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static boolean confirmacaoDoUsuario(){
        while (true){
            Scanner input = new Scanner(System.in);
            String option = input.next();
            if(option.equals("S") || option.equals("s")) return true;
            if(option.equals("N") || option.equals("n")) return false;
            System.err.println("Opção invalida");
        }
    }

    public static double deveRetonarUmDouble(){
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                return input.nextDouble();
            }catch (InputMismatchException e){
                System.err.println("Por favor digite somente numero ou numeros com casas decimais use ',' ");
            }
        }
    }

    public static long deveRetornarUmLong(){
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                return input.nextLong();
            }catch (InputMismatchException e){
                System.err.println("Por favor digite somente numero");
            }
        }
    }

}
