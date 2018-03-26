/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

public class Wall {

    private int large, medium, small, height;

    public Wall(int l, int h) {
        this.height = h;

        large = 0;
        medium = 0;
        small = 0;

        buildWall(l, h);
    }
    
    public Wall(int l, int h, WallDetail wd) {
        this.height = h;

        large = 0;
        medium = 0;
        small = 0;

        buildWall(l, h, wd);
    }


    public void buildWall(int l, int h, WallDetail wd) {
        for (int i = 0; i < h; i++) {
            int goal = l;
            //Check if wall detail should be subtracted in wall length
            if (i <= wd.getHeight()) {
                goal -= wd.getLength();

                while (goal > 0) {
                    //check and add large
                    if (goal - 4 >= 0) {
                        large++;
                        goal -= 4;
                    }
                    if (goal - 2 >= 0) {
                        medium++;
                        goal -= 2;
                    }
                    if (goal - 1 >= 0) {
                        small++;
                        goal -= 1;
                    }
                }
            }
            else {
                //if there is no wall detail
                while (goal > 0) {
                //check and add large
                if (goal - 4 >= 0) {
                    large++;
                    goal -= 4;
                }
                if (goal - 2 >= 0) {
                    medium++;
                    goal -= 2;
                }
                if (goal - 1 >= 0) {
                    small++;
                    goal -= 1;
                }
            }
            }
        }
    }

    private void buildWall(int l, int h) {
        for (int i = 0; i < h; i++) {
            int goal = l;
            while (goal > 0) {
                //check and add large
                if (goal - 4 >= 0) {
                    large++;
                    goal -= 4;
                }
                if (goal - 2 >= 0) {
                    medium++;
                    goal -= 2;
                }
                if (goal - 1 >= 0) {
                    small++;
                    goal -= 1;
                }
            }
        }
    }

    public int getLarge() {
        return large;
    }

    public int getMedium() {
        return medium;
    }

    public int getSmall() {
        return small;
    }

}
