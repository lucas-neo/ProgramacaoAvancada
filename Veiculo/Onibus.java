public class Onibus extends Veiculo {
    private int quantidadeEixos;
    private static final int TANQUE = 200;
    private static final double CONSUMO = 5.0;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (quantidadeEixos >= 6 && quantidadeEixos <= 8) {
            this.quantidadeEixos = quantidadeEixos;
        } else {
            System.out.println("Erro: O ônibus deve ter entre 6 e 8 eixos. Objeto não criado.");
            // Uma alternativa seria lançar uma exceção, mas estamos apenas impedindo a criação do objeto.
        }
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE * CONSUMO;
    }
}
