public class Main {
    public static void main(String[] args){
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 2, "Diesel", 5);
        Onibus onibus = new Onibus("Mercedes", "Sprinter", 2020, 30, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Elétrico", "Sedan", 100);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R500", 2022, 2, "Diesel", 10, -10);

        Veiculo[] veiculos = {carro, caminhao, onibus, carroEletrico, caminhaoRefrigerado};

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println("Autonomia: " + veiculo.calcularAutonomia() + " km");
            System.out.println("--------------------------------");
        }
    }
}
