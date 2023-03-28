public enum TipoCafe {
    NOT_FOUND(0), EXPRESO(1), AMERICANO(2), CAPUCHINO(3);

    private final int tipoCafe;

    TipoCafe (int tipo) {
        tipoCafe = tipo;
    }

    public static TipoCafe encontrarPorID(int tipoIngresado){
        for(TipoCafe tipo : values()){
            if(tipoIngresado == tipo.tipoCafe){
                return tipo;
            }
        }
        return TipoCafe.NOT_FOUND;
    }
}
