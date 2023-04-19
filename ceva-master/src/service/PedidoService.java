package service;

import model.Pedido;
import model.Usuario;

public class PedidoService {

    public void efetuarPedido(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " efetuado com sucesso!");
        System.out.println("Valor total: " + pedido.calcularValorTotal());
    }

}
