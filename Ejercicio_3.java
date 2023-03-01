/**
 *
 * @author santi
 */

 public class Ejercicio_3 {
    public static void main(String[] args) {
        // variable de inicio, variable de finalizacion, y seleccion de par con "0" o impar con "1"
            int ini = 0; 
            int fin = 20;
            int seleccion = 1;

            if (seleccion == 0){
                System.out.println("Eligió solo pares");
                while (ini <= fin){
                    if (ini %2 == 0) {
                    System.out.println(ini);
                    }
                    ini += 1;
                }
            } else {
                System.out.println("Eligió solo impares");
                while (ini <= fin){
                    if (ini %2 == 1) {
                    System.out.println(ini);
                    }
                    ini += 1;
                }
            }
        }
}
