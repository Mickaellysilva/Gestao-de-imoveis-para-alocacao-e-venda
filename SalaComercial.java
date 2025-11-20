public class SalaComercial extends Imovel {
    private boolean temEstacionamento;

    public SalaComercial(String endereco, double area, double valorBase, boolean temEstacionamento){
        super(endereco, area, valorBase);
        this.temEstacionamento = temEstacionamento;
    }

    public boolean isTemEstacionamento() {
        return temEstacionamento;
    }

    public void setTemEstacionamento(boolean temEstacionamento) {
        if(temEstacionamento == true){
            this.temEstacionamento = temEstacionamento;
            System.out.println("A sala comercial tem estacionamento.");
        }
        else{
            System.out.println("A sala comercial não tem estacionamento.");
        }
    }

    @Override
    public void calcularValorFinal() {
        double valorFinal;
        if(temEstacionamento==true){
            valorFinal = (valorBase * 1.05);
            System.out.println(" O valor da sala comercial com estacionamento é: " + valorFinal);
        }
        else{
            valorFinal = valorBase;
            System.out.println("O valor final da sala sem estacionamento é: " + valorFinal);
        }
    }
}
