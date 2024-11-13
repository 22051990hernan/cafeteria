
package cafeteria;


public class Expresso extends Cafe {
     private double costoEspresso = 1.0;  

    public double getCostoEspresso() {
        return costoEspresso;
    }
  public Expresso() {
    }
    public void setCostoEspresso(double costoEspresso) {
        this.costoEspresso = costoEspresso;
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

   
    public double getCostoExpresso() {
        return costoEspresso;}
    

    @Override
    public double calcularPrecio() {
        return precioBase + costoEspresso;
    }
}
