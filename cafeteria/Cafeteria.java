
package cafeteria;


public class Cafeteria {

   
    public static void main(String[] args) {
        
             
        
        Cafe espresso = new Expresso();
        
        Cafe capuchino = new Capuccino();
        
        Cafe cafeConLeche = new CafeLeche();
        
        
        
         
        
        System.out.println("El precio del Expresso es: $" + espresso.calcularPrecio());
        
            System.out.println("El precio del Capuccino es: $" + capuchino.calcularPrecio());
          System.out.println("El precio del Cafe con Leche es: $" + cafeConLeche.calcularPrecio());
                  Vendedor vendedor = new Vendedor(capuchino, "miguel", 1);

    }
    }
    
