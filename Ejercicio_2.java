/**
 *
 * @author santi
 */

 public class Ejercicio_2{
    public static void main(String[] args) {
        //variable de inicio, variable de finalizacion, y mostrando solo pares.
        int ini = 0; 
        int fin = 20;
        System.out.println("Solo Pares");
        while (ini <= fin){
            if (ini %2 == 0) {
            System.out.println(ini);
            }
            ini += 1;
        }
    }
}