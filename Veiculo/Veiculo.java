abstract public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int capacidade;
    private String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidade, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
    }
    public abstract double calcularAutonomia();

    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Combustivel: " + combustivel);
    }

}
