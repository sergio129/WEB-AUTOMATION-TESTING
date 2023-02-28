package org.tevolvers.web.Utilidades;

import org.tevolvers.web.Model.OrderModel;

import java.util.ResourceBundle;

public class DataOrder {
    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("DataOrder");
        }
    }

    public static String getDataOrder(String keys) {

        return resourceBundle().getString(keys);
    }

    public static OrderModel DataOrderModel() {
        OrderModel model = new OrderModel();
        model.setName(DataOrder.getDataOrder("order.name"));
        model.setCountry(DataOrder.getDataOrder("order.country"));
        model.setCity(DataOrder.getDataOrder("order.city"));
        model.setCreditCard(DataOrder.getDataOrder("order.creditCard"));
        model.setMonth(DataOrder.getDataOrder("order.month"));
        model.setYear(DataOrder.getDataOrder("order.year"));
        return model;
    }
}