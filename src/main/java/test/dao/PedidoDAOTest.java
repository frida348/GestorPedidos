/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dao.PedidoDAO;
import modelo.Pedido;
import java.util.List;

class PedidoDAOTest {
    private PedidoDAO pedidoDAO;

    @BeforeEach
    void setUp() {
        pedidoDAO = new PedidoDAO();
    }

    @Test
    void guardarPedido() {
        Pedido pedido = new Pedido("Cliente1", 200.0);
        pedidoDAO.guardarPedido(pedido);
        List<Pedido> pedidos = pedidoDAO.obtenerPedidos();
        assertEquals(1, pedidos.size());
        assertEquals("Cliente1", pedidos.get(0).getCliente());
    }

    @Test
    void obtenerPedidos_Vacio() {
        List<Pedido> pedidos = pedidoDAO.obtenerPedidos();
        assertTrue(pedidos.isEmpty());
    }
}

