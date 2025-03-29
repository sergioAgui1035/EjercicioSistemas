import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();
        boolean flag = true;

        while (flag) {
            Dispositivos dispositivos = new Dispositivos();
            System.out.println("Ingrese la opción que quieras ");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opcion válida");
                sc.next();
            }
            Integer opt = sc.nextInt();

            System.out.println("Ingrese la cantidad de dispositivos desea ingresar ");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opcion válida");
                sc.next();
            }
            Integer cantidadDispositivos = sc.nextInt();

            switch (opt) {
                case 1:
                    dispositivos = metodos.IngresarDispositivo(cantidadDispositivos);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    break;
            }
            
        }
    }
}
