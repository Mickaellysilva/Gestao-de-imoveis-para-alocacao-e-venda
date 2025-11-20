public class Casa extends Imovel {
    private boolean temQuintal ;

    public Casa(String endereco, double area, double valorBase, boolean temQuintal) {
        super(endereco, area, valorBase);
        this.temQuintal = temQuintal;
    }

    public boolean isTemQuintal() {
        return temQuintal;
    }

    public void setTemQuintal(boolean temQuintal) {
        this.temQuintal = temQuintal;
    }

    @Override
    public void calcularValorFinal() {
        double valorFinal;
        if(temQuintal==true){
            valorFinal = (valorBase * 1.1);
            System.out.println("O valor final é: " + valorFinal);
        }
        else{
            valorFinal = valorBase;
            System.out.println("O valor final é: "+valorFinal);
        }
    }
}
