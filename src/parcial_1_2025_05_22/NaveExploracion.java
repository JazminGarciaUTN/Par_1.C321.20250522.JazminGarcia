
package parcial_1_2025_05_22;

/**
 *
 * @author Jazmin
 */
public class NaveExploracion extends Nave{

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, Mision mision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
    }

    
    
    @Override
    public void iniciarExploracion(){
        System.out.println("...Nave iniciando Exploración... ");
    }
    
    @Override
    public void mostrarNaves(){
        System.out.println("Nombre: " + nombre + " Capacidad de Tripulación: " + capacidadTripulacion + 
                " Año de lanzamiento: " + anioLanzamiento );
    }
    
}
