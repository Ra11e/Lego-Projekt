/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PresentationLayer;

import FunctionLayer.DataRetrievalException;
import FunctionLayer.LegoHouse;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PieceList extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, DataRetrievalException {
        
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Order order = FunctionLayer.LogicFacade.getOrder(id);
            
            LegoHouse legoHouse = FunctionLayer.LogicFacade.getLegoHouse(order.getLength(), order.getHeight(), order.getWidth());
            
            request.getSession().setAttribute("legoHouse", legoHouse);
            
            
            return "pieceList";
        } catch (DataRetrievalException ex) {
            throw new DataRetrievalException("Error finding id or connecting to databse");
        }
        
    }

    
}
