public class Cafe {
    private int agua;
    private int crema;
    private int gramosCafe;
    private int vasos;

    public Cafe() {
    }

    public Cafe(int agua, int crema, int gramosCafe, int vasos) {
        this.agua = agua;
        this.crema = crema;
        this.gramosCafe = gramosCafe;
        this.vasos = vasos;
    }

    public Cafe(int agua, int gramosCafe) {
        this.agua = agua;
        this.gramosCafe = gramosCafe;
    }

    public Cafe(int agua, int crema, int gramosCafe) {
        this.agua = agua;
        this.crema = crema;
        this.gramosCafe = gramosCafe;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getGramosCafe() {
        return gramosCafe;
    }

    public void setGramosCafe(int gramosCafe) {
        this.gramosCafe = gramosCafe;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "agua=" + agua +
                ", crema=" + crema +
                ", gramosCafe=" + gramosCafe +
                ", vasos=" + vasos +
                '}';
    }

    class expreso extends Cafe{
        public expreso() {
            super(120,15);
        }
    }
    class americano extends Cafe{
        public americano() {
            super(180,20);
        }
    }

    class capuchino extends Cafe{
        public capuchino() {
            super(180,70, 14);
        }
    }

    public void llenarCafetera(int agua, int crema, int gramosCafe, int vasos){
        this.agua += agua;
        this.crema += crema;
        this.gramosCafe += gramosCafe;
        this.vasos += vasos;
    }
    public boolean verificarIngredientes(Cafe cafe){
        if (this.agua - cafe.agua < 0){
            System.out.println("No hay agua suficiente para preparar el cafe");
            return false;
        } else if (this.crema - cafe.crema < 0) {
            System.out.println("No hay crema suficiente para preparar el cafe");
            return false;
        }
        else if (this.gramosCafe - cafe.gramosCafe < 0){
            System.out.println("No hay gramos de cafe suficientes para preparar el cafe");
            return false;
        }
        else if (this.vasos == 0){
            System.out.println("No hay vasos suficientes para preparar el cafe");
            return false;
        }
        return true;
    }
    public void preparCafe(Cafe cafe){
        if (verificarIngredientes(cafe)) {
            System.out.printf("Preparando cafe");
            this.agua -= cafe.agua;
            this.crema -= cafe.crema;
            this.gramosCafe -= cafe.gramosCafe;
            this.vasos -= 1;
        }
    }


}
