/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBAccess;

import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataMapper {

    public static ArrayList<Order> getOrders(int id) {
        try {
            ArrayList<Order> orders = new ArrayList<>();
        Connection con = Connector.connection();
        String SQL = "SELECT * FROM orders WHERE user_id=?";
        PreparedStatement ps = con.prepareStatement( SQL );
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while ( rs.next() ) {
                int orderId = rs.getInt("order_id");
                int length = rs.getInt("length");
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                String status = rs.getString("status");
                
                
                
                orders.add(new Order(orderId, id, length, height, width, status));
                
        }
        return orders;
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null;
    }

}
