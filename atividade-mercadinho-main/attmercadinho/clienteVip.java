package mercado.attmercadinho;

public class clienteVip extends cliente {
    private String numeroDoCartao;
   
    
    public clienteVip(String numeroDoCartao, String nome, double valorDaCompra) {
        super(nome, valorDaCompra);
        this. numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
     
    
    
    public double calcularPagamento(){
        double des = (this.getValorDaCompra() * 10) / 100;
        return this.getValorDaCompra() - des;
    }

    @Override
    public String toString() {
        return "clienteVip{" + "numeroDoCartao=" + numeroDoCartao + '}';
    }
        

    

   
    
   
    
    
}
