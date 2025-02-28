public class Carro extends Veiculo {
    private String tipoCarro;
    private static final int TANQUE = 50;
    private static final double CONSUMO = 12.0;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE * CONSUMO;
    }
}
