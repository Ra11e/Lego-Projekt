/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PresentationLayer;

import FunctionLayer.LegoHouse;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PieceList extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Order order = FunctionLayer.LogicFacade.getOrder(id);
        
        LegoHouse legoHouse = FunctionLayer.LogicFacade.getLegoHouse(order.getLength(), order.getHeight(), order.getWidth());
        
        request.getSession().setAttribute("legoHouse", legoHouse);
        
        
        return "pieceList";
    }

    
}
