public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        
        // Tipo de datos y operdores
        String res = "Hola";
        int resultado = 23 + 5;
        int resultado2 = 23 - 5;
        double resultado3 = 23 * 5;
        float resultado4 = 23 / 5;
        int resultado5 = 23 % 5;
        
        //Operadores unarios
        resultado++; // resultado = resultado + 1
        resultado--; // resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;
        
        //Operadores lógicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 >= 8;
        respuesta = 5 <= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
        respuesta = 12 < 5 && 4 > 1;
        respuesta = 12 < 5 || 4 > 1;

        //Operadores bit a bit
        //&
        //^
        //|

        //Estructuras de control
        if (respuesta) {
            //bloque de código
        } 
        if (respuesta) {
            //bloque de código si se cumple
        } else {
            //bloque de código si no se cumple
        }
                
    }
}
