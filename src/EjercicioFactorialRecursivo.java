public class EjercicioFactorialRecursivo {

    //Funcion factorial con recursivilidad llamandose a si mismo
    static int Factorial(int numero){
        if(numero == 0 || numero == 1)
            return 1;//por convención, el factorial de cero es 1
        else
            return numero * Factorial(numero-1);

    }
    /*Ejemplo
        numero(5) * Factorial(5-1=(4))
            numero(4) * Factorial(4-1=(3))
                numero(3) * Factorial(3-1=(2))
                    numero(2) * Factorial(2-1=(1))

                    //Se procede a realizar el factorial multiplicando

                    2 * 1 = 2
                3 * 2 = 6
            4 * 6 = 24
        5 * 24 = 120

        //Resultado = 120
     */
    public static void main(String[] args) {
        var factor = Factorial(5);

        System.out.println("Valor de factorial = " + factor);
    }
}
