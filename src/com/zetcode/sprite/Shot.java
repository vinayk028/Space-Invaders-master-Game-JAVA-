package com.zetcode.sprite;

import javax.swing.ImageIcon;

public class Shot extends Sprite {

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
        
    }

    

    private void initShot(int x, int y) {

        var shotImg = "src/images/shot.png";
        var ii = new ImageIcon(shotImg);
        setImage(ii.getImage());

        int H_ENTER = 6;
        setX(x + H_ENTER);

        int VK_ENTER = 1;
        setY(y - VK_ENTER);

        
        int H_SPACE = 6;
        setX(x + H_SPACE);

        int VK_SPACE = 1;
        setY(y - VK_SPACE);

        
        int H_V = 6;
        setX(x + H_V);

        int VK_V = 1;
        setY(y - VK_V);

        


        
    }
}
