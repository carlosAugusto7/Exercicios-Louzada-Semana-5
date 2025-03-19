import java.util.Scanner;

public class ConversaoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();
        
        String conceito;
        switch (nota) {
            case 9:
            case 10:
                conceito = "A";
                break;
            case 7:
            case 8:
                conceito = "B";
                break;
            case 5:
            case 6:
                conceito = "C";
                break;
            case 3:
            case 4:
                conceito = "D";
                break;
            case 0:
            case 1:
            case 2:
                conceito = "E";
                break;
            default:
                conceito = "Nota inválida.";
        }
        
        System.out.println("Conceito: " + conceito);
        
        scanner.close();
    }
}
