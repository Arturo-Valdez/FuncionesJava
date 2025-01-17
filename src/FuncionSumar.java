public class FuncionSumar {

    //Funcion de suma recibe 2 argumentos y devuelve resultado
    static int suma(int valor1, int valor2){
        var resultado = valor1 + valor2;
        return resultado;
    }

    public static void main(String[] args) {
        //Generar argumentos en variables
        int arg1 = 10, arg2=50;

        //Asignacion del valor resuelto en una variable
        var sumando = suma(arg1,arg2);

        //Impresion
        System.out.println("Suma = " + sumando);
    }
}
