
package cafeteria;


public class Vendedor {
    
    private Cafe cafe;
    private String nombre;
    private int cantidad;

    public Vendedor(Cafe cafe, String nombre, int cantidad) {
        this.cafe = cafe;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
