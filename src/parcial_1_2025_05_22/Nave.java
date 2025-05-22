
package parcial_1_2025_05_22;

/**
 *
 * @author Jazmin
 */
public abstract class Nave {
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;
    protected String tipoNave;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public void iniciarExploracion(){
        System.out.println("Iniciando exploración");
    }
    
    public void mostrarNaves(){
        System.out.println("Tipo de nave: " + tipoNave + "Nombre: " + nombre + " Capacidad de tripulación: " + capacidadTripulacion 
                + " Año de lanzamiento: " + anioLanzamiento);
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public void setCapacidadTripulacion(int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    
    
    
}
