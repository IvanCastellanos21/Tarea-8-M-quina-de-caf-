import java.util.Scanner;

public class Main {
    static Cafe cafe = new Cafe (5000, 1500, 1000, 50);
    final static Scanner scanner = new Scanner(System.in);

    static void elegirCafe(){
        String elegirCafe;
        TipoCafe tipoCafe;
        do {
            System.out.println("Elegir tipo de cafe: 1 - Expreso, 2 - Americano, 3 - Capuchino, regresar - A menu principal");
            elegirCafe = scanner.next();

            if(elegirCafe.equals("regresar")){
                return;
            }

            tipoCafe = TipoCafe.encontrarPorID(Integer.parseInt(elegirCafe));

            switch (tipoCafe) {
                case EXPRESO:
                    Cafe expreso = new expreso();
                    cafe.preparCafe(expreso);
                    break;
                case AMERICANO:
                    Cafe americano = new americano();
                    cafe.preparCafe(americano);
                    break;
                case CAPUCHINO:
                    Cafe capuchino = new capuchino();
                    cafe.preparCafe(capuchino);
                    break;
                default:
                    break;
            }

        } while (tipoCafe.name().equals("NOT_FOUND"));
    }
    static void llenarIngredientes() {
        System.out.println("Ingresar cantidad de agua");
        int agua = scanner.nextInt();
        System.out.println("Ingresar cantidad de crema");
        int crema = scanner.nextInt();
        System.out.println("Ingresar cantidad de cafe");
        int cafe = scanner.nextInt();
        System.out.println("Ingresar cantidad de vasos");
        int vasos = scanner.nextInt();
    }
    public static void main(String[] args) {
        System.out.println(cafe.toString());
        String opcion;
        do {
            System.out.println("Escribir accion a realizar: preparar, llenar, verificar, salir");
            opcion = scanner.next();
            switch(opcion){
                case "preparar":
                    elegirCafe();
                    break;
                case "llenar":
                    llenarIngredientes();
                    break;
                case "verificar":
                    System.out.println(cafe.toString());
                    break;
            }
        } while (!opcion.equals("salir"));
    }
}