public class Terreno extends Imovel {
    private boolean permiteConstruir;

    public Terreno(String endereco, double area, double valorBase, boolean permiteConstruir) {
        super(endereco, area, valorBase);
        this.permiteConstruir = permiteConstruir;
    }

    public boolean isPermiteConstruir() {
        return permiteConstruir;
    }

    public void setPermiteConstruir(boolean permiteConstruir) {
        if(permiteConstruir==true){
            this.permiteConstruir = permiteConstruir;
            System.out.println("Permissão concedida para construir.");
        }
        else{
            System.out.println("Não é possível construir neste terreno.");
        }
    }

    @Override
    public void calcularValorFinal() {
        double valorFinal;
        if(permiteConstruir!=true){
            valorFinal = (valorBase * 0.20);
            System.out.println("O valor final do terreno que não permite construir é: " + valorFinal);
        }
        else{
            valorFinal = valorBase;
            System.out.println("O valor final do terreno que permite construir é:" + valorFinal);
        }
    }
}
