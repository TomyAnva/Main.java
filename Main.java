import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

    System.out.print("Escribe tu Nombre: ");
    String nombre = scanner.nextLine();

 System.out.print("Ingrese primer numero: ");
 int n1 = scanner.nextInt();
 System.out.print("Ingrese segundo numero: ");
 int n2 = scanner.nextInt();
 System.out.print("Ingrese tercer numero: ");
 int n3 = scanner.nextInt();

 System.out.print(nombre + n1 + n2 + n3);

  scanner.close();
    }
}
