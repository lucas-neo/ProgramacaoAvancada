public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private static final int TANQUE = 300;
    private static final double CONSUMO_BASE = 6.0;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao = capacidadeCarga * 0.01; // Redução de 1% por tonelada

        if (reducao > 0.25) {
            reducao = 0.25; // Limita a redução máxima a 25%
        }

        double consumoAjustado = CONSUMO_BASE * (1 - reducao);
        return TANQUE * consumoAjustado;
    }
}
