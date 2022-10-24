package mercado.attmercadinho;

import java.util.ArrayList;

public class mercadinho{
   ArrayList<cliente> clientes = new ArrayList<>();

    public void adicionarCliente(cliente c){
        clientes.add(c);
    }

    public void calcularTotal(){
        double u = 0;
        for (int i = 0; i < clientes.size(); i++) {
     
                u += clientes.get(i).calcularPagamento();
        }
         System.out.println("O valor total das compras de todos os clientes é de " + u + " reais.");
    }
       


    public void imprimirCliente(){
        for (int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i).getNome());
        }
    }
}

