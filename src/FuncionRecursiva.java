public class FuncionRecursiva {
    //Imprimir 1 al 5 usando la funcion recursiva
    //Funcion recursiva

    static void funcionRecursiva(int numero){
        //Caso base
        if (numero == 1)
            System.out.print(numero + " ");
        else {
            //caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
