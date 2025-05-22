
package parcial_1_2025_05_22;

/**
 *
 * @author Jazmin
 */
public class CrucerosEstelares extends Nave {
    private int cantidadPasajeros;

    public CrucerosEstelares(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public void iniciarExploracion(){
        System.out.println("--- LOS CRUCEROS ESTELARES NO PUEDEN REALIZAR EXPLORACIÓN ---");
    }
    
    @Override
    public void mostrarNaves(){
        System.out.println(" Nombre: " + nombre + " Capacidad de tripulación: " + capacidadTripulacion 
                + " Año de lanzamiento: " + anioLanzamiento + " Cantidad de pasajeros: " + cantidadPasajeros); 
    }
    
}
