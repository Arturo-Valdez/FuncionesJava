public class Funciones {
    //Funcion que no devuelve nada, solo imprime en consola y resive un argumento
    static void saludar(String mensaje){
        System.out.println("Mensaje : " + mensaje);
    }

    //Main
    public static void main(String[] args) {
        saludar("Hola que tal bienvenido");
        saludar("Adios");
    }
}
