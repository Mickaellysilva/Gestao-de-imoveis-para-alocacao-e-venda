public class Apartamento  extends Imovel{
    private int andar;
    private boolean temElevador;

    public Apartamento(String endereco, double area, double valorBase, int andar, boolean temElevador) {
        super(endereco, area, valorBase);
        this.andar = andar;
        this.temElevador = true;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isTemElevador() {
        return temElevador;
    }

    public void setTemElevador(boolean temElevador) {
        this.temElevador = temElevador;
    }

    @Override
    public void calcularValorFinal() {
        double valorTotal;
        if(andar>5 && temElevador==false){
            valorTotal = (valorBase * 0.75);
            System.out.println("O valor do apartamento acima do quinto andar e sem elevador é: R$ " + valorTotal);
        }
        else{
            valorTotal = valorBase;
            System.out.println(" O valoe do apartamento é: " + valorTotal);
        }
    }
}
