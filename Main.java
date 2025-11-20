//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Casa casa1 = new Casa("Luiz Ferreira",  100, 2.5000, true);
      Casa casa2 = new Casa("Souza Lima", 300, 15.000, false);

      // exemplo de polimorfismo de sobreposição
      casa1.calcularValorFinal();
      casa1.exibirDetalhes();

      casa2.calcularValorFinal();
      casa2.exibirDetalhes();

      Apartamento apar1 = new Apartamento("Andressa Lima", 400, 5.000, 5, false);
      Apartamento apat2 = new Apartamento("Carina Lisboa", 450, 6.000, 10, true);

      apar1.exibirDetalhes();
      apar1.calcularValorFinal();

      apat2.exibirDetalhes();
      apat2.exibirDetalhes();

      Terreno terr1 = new Terreno("Larrisa luz", 150, 40.000, true);
      Terreno terr2 =  new Terreno(" Liz Souza", 140, 35.000, false);


      terr1.calcularValorFinal();
      // exemplo do uso de polimorfismo por sobrecarga na main.
      terr1.exibirDetalhes();
      terr1.exibirDetalhes();
      terr1.exibirDetalhes();

      terr2.calcularValorFinal();
      terr2.exibirDetalhes();

      SalaComercial sala1 = new SalaComercial("Marina ", 12, 120, false);
      SalaComercial sala2 = new SalaComercial("Paulo Costa", 125, 14.000, true);

      sala1.calcularValorFinal();
      sala1.exibirDetalhes();

      sala2.calcularValorFinal();
      sala2.exibirDetalhes();
    }
}
