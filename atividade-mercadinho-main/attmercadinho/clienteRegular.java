package mercado.attmercadinho;

public class clienteRegular extends cliente {

    public clienteRegular(String nome, double valorDaCompra) {
        super(nome, valorDaCompra);
    }

    public double calcularPagamento(){
        return this.getValorDaCompra();
    }

    
    
}
