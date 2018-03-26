/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunctionLayer;


public class LegoHouse {
    private Wall front;
    private Wall back;
    private Wall left;
    private Wall right;
    
    public LegoHouse(int height, int length, int width) {
        //wallDetail for simulating a door
        this.front = new Wall(length, height, (new WallDetail(2, 5)));
        //WallDetail for sumlating a window
        this.back = new Wall(length, height, (new WallDetail(2,2)));
        this.left = new Wall(width - 4, height);
        this.right = new Wall(width - 4, height);
    }

    public Wall getFront() {
        return front;
    }

    public Wall getBack() {
        return back;
    }

    public Wall getLeft() {
        return left;
    }

    public Wall getRight() {
        return right;
    }
    
    
    
    public int getLarge() {
        return (front.getLarge() + back.getLarge() + left.getLarge() + right.getLarge());
    }
    
    public int getMedium() {
        return (front.getMedium() + back.getMedium() + left.getMedium() + right.getMedium());
    }
    
    public int getSmall() {
        return (front.getSmall() + back.getSmall() + left.getSmall() + right.getSmall());
    }

}
