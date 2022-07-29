package company;

public class Main {

    public static int sumar(int a, int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        System.out.println(sumar(10, 30, 40));

        System.out.println("================================");

        Coche miCoche = new Coche(4);

        System.out.println(miCoche.Puertas);
    }
}