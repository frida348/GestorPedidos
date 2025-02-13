/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.PedidoDAO;
import modelo.Pedido;
import java.util.List;

public class PedidoControlador {
    private PedidoDAO pedidoDAO;

    public PedidoControlador(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }

    public void agregarPedido(String cliente, double total) {
        if (cliente == null || cliente.isEmpty() || total <= 0) {
            throw new IllegalArgumentException("Datos inválidos para el pedido");
        }
        Pedido pedido = new Pedido(cliente, total);
        pedidoDAO.guardarPedido(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoDAO.obtenerPedidos();
    }
}
