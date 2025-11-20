public abstract class Imovel {
    protected String endereco;
    protected double area;
    protected double valorBase;

    public Imovel(String endereco, double area, double valorBase) {
        this.endereco = endereco;
        this.area = area;
        this.valorBase = valorBase;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
   // Esse metodo é um exemplo de polimorfismo  de sobreposição, pois
   // é um metodo que está na classe-mae e que nas classes filhas: Casa,
   // Apartamento, Terreno e SalaComercial  com a mesma assinatura de metodo
    public abstract void calcularValorFinal();

    // já este metodo é um exemplo de polimorfismo por sobrecarga, onde
    // esse metodo possui varias assinaturas diferentes (por conta dos
    // parâmetros) apesar de ter o mesmo nome.
    public void exibirDetalhes(){
        System.out.println("Detalhes: ");
        System.out.println("Endereço: " +getEndereco());
        System.out.println("Área: " +getArea());
    }

    public void exibirDetalhes(boolean detalhesCompletos){
        System.out.println("Detalhes completos: ");
        System.out.println("Endereço: " +getEndereco());
        System.out.println("Área: " +getArea());
        if(detalhesCompletos==true){
            System.out.println("Valor Base: " +valorBase);
        }

    }

    public void exibirDetalhes(boolean detalhesCompletos, boolean incluirValorFinal){
        double valorFinal = valorBase;
        System.out.println("Detalhes completos com inclusão do valor final: ");
        System.out.println("Endereço: " +getEndereco());
        System.out.println("Área: " +getArea());
        if(detalhesCompletos==true){
            System.out.println("Valor Base: " +valorBase);
        }
        if(incluirValorFinal==true){
            System.out.println("ValorFinal" +valorFinal);
        }
    }

}
