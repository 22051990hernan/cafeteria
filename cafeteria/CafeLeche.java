
package cafeteria;


public class CafeLeche extends Cafe {
    
      private double costoLeche = 0.5; 

    public CafeLeche() {
    }

    public double getCostoLeche() {
        return costoLeche;
    }

    public void setCostoLeche(double costoLeche) {
        this.costoLeche = costoLeche;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }
      
      
      
     @Override
    public double calcularPrecio() {
        return precioBase + costoLeche;
    }
    
}
