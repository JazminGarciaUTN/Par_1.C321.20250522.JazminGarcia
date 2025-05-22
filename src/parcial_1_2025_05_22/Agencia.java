
package parcial_1_2025_05_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jazmin
 */
public class Agencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Nave> listaNaves = new ArrayList();
        int opcion;
        
        do{
            System.out.println(" ---- MENÚ DE GESTIÓN DE EXPEDICIONES ESPACIALES ----");
            System.out.println("-Opción 1: Agregar Nave");
            System.out.println("-Opción 2: Mostrar todas las naves");
            System.out.println("-Opción 3: Iniciar exploración");
            System.out.println("-Opción 4: Mostrar naves ordenadas por nombre");
            System.out.println("-Opción 5: Mostrar naves ordenadas por año de lanzamiento");
            System.out.println("-Opción 6: Mostrar navez ordenadas por tripulación");
            System.out.println("-Opción 7: Salir");
            
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    
                    nave.add(listaNaves);
                    break;
                case 2:
                    //
                    break;
                case 3:
                    iniciarExploracion();
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
            }
            
        }while (opcion != 7);
        
        
        scanner.close();
    }
    
}
