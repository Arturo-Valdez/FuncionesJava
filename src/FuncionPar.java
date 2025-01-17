import java.util.Scanner;

public class FuncionPar {

    //Funcion sinRetorno obtiene un argumento
    static void FuncionPar(int valor){
        if(valor % 2 == 0)
            System.out.println("\nEs Par");
        else
            System.out.println("\nNo es par");

    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int valor;
        //Titulo
        System.out.println("*** Es Par ***");

        //Obtencin valor
        System.out.print("Ingresa el valor: ");
        valor = consola.nextInt();

        //Mandar a llamar a funcion
        FuncionPar(valor);
    }
}
