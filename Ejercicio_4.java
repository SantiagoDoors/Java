/**
 *
 * @author santi
 */

 public class Ejercicio_4 {
    public static void main(String[] args) {
        //variable de inicio, variable de finalizacion, mostrando solo pares e invirtiendo el orden.
        int ini = 0;
        int fin;
        System.out.println("Solo Pares");
        for (fin = 20; fin >= ini; fin--){
            if (fin %2 == 0) {
            System.out.println(fin);
            }
        }
    }
}

