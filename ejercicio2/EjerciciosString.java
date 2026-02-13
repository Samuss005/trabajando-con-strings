package ejercicio2;
/**
 * Estos son ejercicios del tema 1: "La Clase String"
 * Aquí te dejo unos cuantos ejercicios variados para entrenar el manejo de los métodos de la
 * clase String.
 *
 * Ya está la cabecera de todos los métodos a desarrollar por lo que solo tendrás que desarrollar
 * el código para que realice lo que te indica el enunciado.
 *
 * Una vez hallas terminado, podrás ir comprobando tus resultados ejecutando el main de este ejercicio
 * que tiene ya una batería de pruebas.
 *
 * Nota: lee atentamente los enunciados, plantea el algoritmo en una hoja en sucio, cuidado con las posibles Excepciones o errores...
 */
public class EjerciciosString {

    /**
     *  Ejercicio 1: contar cuántas veces aparece una letra usando SOLO indexOf()
     */
    public static int ContarLetra(String s, char c) {

        int contador = 0;
        int pos = s.indexOf(c);

        while (pos != -1) {
            contador++;
            pos = s.indexOf(c, pos + 1);
        }

        return contador;
    }

    /**
     *  Ejercicio 2: palabras que CONTIENEN s2
     */
    public static String Filtrar1 (String s1, String s2){

        String resultado = "";
        int inicio = 0;

        while (inicio < s1.length()) {

            int fin = s1.indexOf(" ", inicio);
            if (fin == -1) {
                fin = s1.length();
            }

            String palabra = s1.substring(inicio, fin);

            if (palabra.indexOf(s2) != -1) {
                resultado = resultado + palabra + " ";
            }

            inicio = fin + 1;
        }

        return resultado.trim();
    }

    /**
     *  Ejercicio 3: palabras que EMPIEZAN por s2
     */
    public static String Filtrar2 (String s1, String s2){

        String resultado = "";
        int inicio = 0;

        while (inicio < s1.length()) {

            int fin = s1.indexOf(" ", inicio);
            if (fin == -1) {
                fin = s1.length();
            }

            String palabra = s1.substring(inicio, fin);

            if (palabra.indexOf(s2) == 0) {
                resultado = resultado + palabra + " ";
            }

            inicio = fin + 1;
        }

        return resultado.trim();
    }

    /**
     *  Ejercicio 4: filtrar correos por dominio
     */
    public static String FiltrarCorreo (String s1, String s2){

        String resultado = "";
        int inicio = 0;

        while (inicio < s1.length()) {

            int fin = s1.indexOf(" ", inicio);
            if (fin == -1) {
                fin = s1.length();
            }

            String correo = s1.substring(inicio, fin);

            if (correo.indexOf("@" + s2) != -1) {
                resultado = resultado + correo + " ";
            }

            inicio = fin + 1;
        }

        return resultado.trim();
    }

    /**
     *  Ejercicio 5: IP que NO contienen s2
     */
    public static String FiltrarIP (String s1, String s2){

        String resultado = "";
        int inicio = 0;

        while (inicio < s1.length()) {

            int fin = s1.indexOf(" ", inicio);
            if (fin == -1) {
                fin = s1.length();
            }

            String ip = s1.substring(inicio, fin);

            if (ip.indexOf(s2) == -1) {
                resultado = resultado + ip + " ";
            }

            inicio = fin + 1;
        }

        return resultado.trim();
    }

    /**
     *  Ejercicio 6: filtrar fechas según el mes
     */
    public static String FiltrarFecha (String s1, String s2){

        String resultado = "";
        int inicio = 0;

        while (inicio < s1.length()) {

            int fin = s1.indexOf(" ", inicio);
            if (fin == -1) {
                fin = s1.length();
            }

            String fecha = s1.substring(inicio, fin);
            String mes = fecha.substring(3,5);

            boolean eliminar = false;

            if (mes.equals("01") && s2.equals("ENERO")) eliminar = true;
            if (mes.equals("10") && s2.equals("OCTUBRE")) eliminar = true;
            if (mes.equals("12") && s2.equals("DICIEMBRE")) eliminar = true;

            if (!eliminar) {
                resultado = resultado + fecha + " ";
            }

            inicio = fin + 1;
        }

        return resultado.trim();
    }

    //=============================================================================//
    //============================== MAIN =======================================//
    //=============================================================================//

    public static void main(String[] args) {

        String vacia = "";

        String c2 = "o";
        String c3 = "ouo";
        String c4 = "o o o";
        String c5 = "Hola que tal, mira ver cuantas 'a' tengo";
        String c6 = "   Mmm Mmm Mmm no está mal    M ";

        String f1 = "";
        String f2 = "cas";
        String f3 = "casa casita cascos";
        String f4 = "mundo llaves cas caza cosas caos comadrejas caramelos";
        String f5 = "cocos agua caseron roncas carteras aparcas captas cascas";
        String filtro = "cas";

        String f6 = "loca poca mota casa roca bola boca fin ocarina carambola oca ";
        String filtro2 = "oca";

        String MostrarCorreo = "CorreoEjemplo@gmail.com  Ania86@kmail.com  Gonzalo_Rodriguez92@hotmail.com  Prueba@gmail.com "
                + "kaino.miguibr@gmail.com  DEII@ulpgc.es Juan.Gomez102@ulpgc.es kurukuru22@hotmail.com "
                + "Gato@gmail.com  miguibr@hotmail.com ";

        String correo1 = MostrarCorreo;

        String dominio1 = "gmail";
        String dominio2 = "hotmail";
        String dominio3 = "ulpgc";

        String id1 = "196.168.0.1 127.123.1.0 255.230.44.1 100.168.100.1 90.168.0.1";
        String id2 = "42.168.87.177 157.386.1.0 168.105.94.1 0.154.1.68 22.01.201.6 ";
        String id = "168";

        String fecha = "05/12/1996 22/01/2016 03/10/1956 21/12/2012 06/10/2001 12/01/2005 21/10/1999";

        String NombreFecha1 = "OCTUBRE";
        String Nombrefecha2 = "DICIEMBRE";
        String NombreFecha3 = "ENERO";

        System.out.println("PRUEBAS DEL EJERCICIO 1: ContarLetra()");
        System.out.println(ContarLetra(c5,'a'));

        System.out.println("PRUEBAS DEL EJERCICIO 2: Filtrar1");
        System.out.println(Filtrar1(f6, filtro2));

        System.out.println("PRUEBAS DEL EJERCICIO 3: Filtrar2");
        System.out.println(Filtrar2(f6, filtro2));

        System.out.println("PRUEBAS DEL EJERCICIO 4: FiltrarCorreo");
        System.out.println(FiltrarCorreo(correo1, dominio1));

        System.out.println("PRUEBAS DEL EJERCICIO 5: FiltrarIP");
        System.out.println(FiltrarIP(id1, id));

        System.out.println("PRUEBAS DEL EJERCICIO 6: FiltrarFecha");
        System.out.println(FiltrarFecha(fecha, NombreFecha3));
    }
}
