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

}
