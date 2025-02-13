/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.controlador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import controlador.PedidoControlador;
import dao.PedidoDAO;
import modelo.Pedido;
import java.util.List;

class PedidoControladorTest {
    private PedidoControlador pedidoControlador;
    private PedidoDAO pedidoDAO;

    @BeforeEach
    void setUp() {
        pedidoDAO = new PedidoDAO();
        pedidoControlador = new PedidoControlador(pedidoDAO);
    }

    @Test
    void agregarPedido_Valido() {
        pedidoControlador.agregarPedido("Frida", 150.0);
        List<Pedido> pedidos = pedidoControlador.listarPedidos();
        assertEquals(1, pedidos.size());
        assertEquals("Frida", pedidos.get(0).getCliente());
    }

    @Test
    void agregarPedido_Invalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            pedidoControlador.agregarPedido("", -10.0);
        });
        assertEquals("Datos inválidos para el pedido", exception.getMessage());
    }
}
