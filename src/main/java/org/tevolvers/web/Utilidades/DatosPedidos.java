package org.tevolvers.web.Utilidades;

import org.tevolvers.web.Model.PedidoModel;

import java.util.ResourceBundle;

public class DatosPedidos {
    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("DatosPedidos");
        }
    }

    public static String getDatosPedidos(String keys) {
        return resourceBundle().getString(keys);
    }

    public static PedidoModel DatosPedidomodel() {
        PedidoModel model = new PedidoModel();
        model.setNombre(DatosPedidos.getDatosPedidos("Pedido.Nombre"));
        model.setPais(DatosPedidos.getDatosPedidos("Pedido.Pais"));
        model.setCiudad(DatosPedidos.getDatosPedidos("Pedido.Ciudad"));
        model.setTarjetaCredito(DatosPedidos.getDatosPedidos("Pedido.Tarjera.Credito"));
        model.setMes(DatosPedidos.getDatosPedidos("Pedido.Mes"));
        model.setYear(DatosPedidos.getDatosPedidos("Pedido.Ano"));

        return model;
    }
}
