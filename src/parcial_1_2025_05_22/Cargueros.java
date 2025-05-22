
package parcial_1_2025_05_22;

/**
 *
 * @author Jazmin
 */
public class Cargueros extends Nave {
    private int capacidadCarga;

    public Cargueros(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    public void validacionCarga(){
        if(capacidadCarga > 500){
            System.out.println(" Capacidad EXCEDIDA. ");
        }else if(capacidadCarga < 100){
            capacidadCarga = 100;
        }
    }
    
    @Override
    public void iniciarExploracion(){
        System.out.println("...Carguero iniciando exploracion... ");
    }
    
    @Override
    public void mostrarNaves(){
        System.out.println(" Nombre: " + nombre + " Capacidad de carga: " + capacidadCarga 
                + " Capacidad de tripulación: " + capacidadTripulacion + " Año de Lanzamiento: " + anioLanzamiento);
    }
}