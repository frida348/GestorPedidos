/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private List<Pedido> pedidos = new ArrayList<>();

    public void guardarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> obtenerPedidos() {
        return new ArrayList<>(pedidos);
    }
}
