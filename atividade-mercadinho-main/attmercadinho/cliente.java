package mercado.attmercadinho;
public abstract class cliente{
    private String nome;
    private double valorDaCompra;

    public cliente(String nome, double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public String getNome() {
        return nome;
    }

    
    public double getValorDaCompra() {
        return valorDaCompra;
    }
    
    public abstract double calcularPagamento();

    @Override
    public String toString() {
        return "cliente{" + "nome=" + nome + ", valorDaCompra=" + valorDaCompra + '}';
    }

    
    
}
