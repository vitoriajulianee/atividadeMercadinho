package mercado.attmercadinho;
public class Principal {
    public static void main(String[]args){
        mercadinho mercado = new mercadinho();

        clienteRegular cliReg = new clienteRegular("Leandro De Almeida", 2.00);
        clienteRegular cliReg2 = new clienteRegular( "João Neto Matias", 4);
        
        clienteVip cliVip = new clienteVip("95378651-56", "Maria Flor", 56.00);
        clienteVipOuro cVOuro= new clienteVipOuro("50880015-56", "Rua Pinha, 31",  "Helena Viana De Sousa", 873.00);
        clienteVipOuro cVOuro2 = new clienteVipOuro("12359780-56", "Rua Rui Carneiro, 132",  "Luisa Mariano", 555.00);

        mercado.adicionarCliente(cliReg);
        mercado.adicionarCliente(cliVip);
        mercado.adicionarCliente(cVOuro);
        mercado.adicionarCliente(cVOuro2);
        mercado.adicionarCliente(cliReg2);

        mercado.calcularTotal();
        mercado.imprimirCliente();


    }
}
