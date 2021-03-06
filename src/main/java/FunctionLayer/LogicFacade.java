package FunctionLayer;

import DBAccess.DataMapper;
import DBAccess.UserMapper;
import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
    public static ArrayList<Order> getOrders(int id) {
        ArrayList<Order> orders = new ArrayList<Order>();
        orders = DataMapper.getOrders(id);
        
        return orders;
    }
    
    public static ArrayList<Order> getAllOrders() {
        ArrayList<Order> orders = DataMapper.getAllOrders();
        return orders;
    }
    
    public static Order getOrder(int id) throws DataRetrievalException {
        return DataMapper.getOrder(id);
    }
    
    public static void createOrder(int id, int length, int height, int width) {
        Order order = new Order(id, length, height, width);
        DataMapper.createOrder(order);
    }
    
    public static void changeStatus(int orderId) throws LoginSampleException {
        DataMapper.changeStatus(orderId);
    }
    
    public static LegoHouse getLegoHouse(int length, int height, int width) {
        return new LegoHouse(height, length, width);
    }

}
