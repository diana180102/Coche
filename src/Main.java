public class Main {
    public static void main(String[] args) {
        
        int resultado = suma(3, 4, 8);

        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.puertas();
        miCoche.puertas();
        miCoche.puertas();
        System.out.println(miCoche.nPuertas);
    }
    
    public static int suma (int a, int b, int c){

        return a + b + c;
    }
}
