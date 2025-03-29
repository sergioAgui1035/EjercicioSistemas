import java.util.Scanner;

import Objetos.Pc;
import Objetos.Tablet;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public Dispositivos IngresarDispositivo(Integer cantidadDispositivos){
        Dispositivos dispositivos = new Dispositivos();
        System.out.println("Ingrese la opcion del dispositivo que desea ingresar");
        for (int i = 0; i < cantidadDispositivos; i++) {

            System.out.println("Ingrese que dispositivo desea ingresar: 1.Tablet 2.Pc");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opcion válida");
                sc.next();
            }
            Integer tipoDispositivo = sc.nextInt();


            switch (tipoDispositivo) {
                case 1:
                    Tablet tablet = new Tablet();
                    tablet.setSerial(i+"-"+(int) (Math.random()*100+1))
                    tablet.setTamaño((int) (Math.random()*20+1));
                    tablet.setPrecio((int) (Math.random()*1000000+1));
                    tablet.setNombreEstudiante("Estudiante - " + 1);
                    tablet.setMarca("Marca - " + i);
                    tablet.setDisponible(true);
                    break;
                case 2:
                    Pc pc = new Pc();

                    break;
            
                default:
                    break;
            }
        }
        return dispositivos;
    }
}
