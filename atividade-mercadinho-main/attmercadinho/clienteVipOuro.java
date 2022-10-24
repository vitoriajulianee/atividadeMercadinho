package mercado.attmercadinho;
public class clienteVipOuro extends cliente {
     private String endereco;
     private String numeroDoCartao;

    public clienteVipOuro(String numeroDoCartao, String endereco, String nome, double valorDaCompra) {
        super(nome, valorDaCompra);
        this.endereco = endereco;
        this.numeroDoCartao= numeroDoCartao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    
    
    
    
   
    public double calcularPagamento(){
        double des = (this.getValorDaCompra() * 15) / 100;
        return this.getValorDaCompra() - des;
    }

    @Override
    public String toString() {
        return "clienteVipOuro{" + "endereco=" + endereco + ", numeroDoCartao=" + numeroDoCartao + '}';
    }
    
    
 }
     

     
