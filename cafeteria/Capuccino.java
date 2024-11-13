
package cafeteria;


public class Capuccino extends Cafe {
    
     private double costoLecheEspumada = 0.75;

    public Capuccino() {
    }

    public double getCostoLecheEspumada() {
        return costoLecheEspumada;
    }

    public void setCostoLecheEspumada(double costoLecheEspumada) {
        this.costoLecheEspumada = costoLecheEspumada;
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
        return precioBase + costoLecheEspumada;
    }
    
}
