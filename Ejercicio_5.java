/**
 *
 * @author santi
 */

public class Ejercicio_5 {

    public static void main(String[] args) {
        int ingresos = 300000, sup = 31, energia = 3331;
        if ( (ingresos <= 275000) && ( sup <= 30) &&(energia <= 3330) ) {
            System.out.println("Categoría C");
        } else if((ingresos <= 555000) && (sup <= 45) && (energia <= 5000) ) {
            System.out.println("Categoría B");
        } else {
            System.out.println("Categoria A");
        }
    }            
}
