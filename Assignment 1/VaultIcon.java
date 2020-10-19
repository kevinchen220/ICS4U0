/*
VaultIcon
Created by: Kevin Chen
Last Modified: October 6, 2020
Description: An Icon that looks like a Vault
 */

import becker.robots.icons.*;
import java.awt.*;

public class VaultIcon extends Icon
{
    // Default Constructor
    public VaultIcon()
    {
        super();
    }

    //Overrides paintIcon method to draw VaultIcon
    public void paintIcon(Graphics g)
    {
        g.fillRect(30, 0, 10, 100);

        g.setColor(Color.WHITE);
        g.fillRect(20, 0, 10, 100);

        g.setColor(Color.RED);
        g.fillRect(20, 0, 20, 20);
        g.fillRect(20, 40, 20, 20);
        g.fillRect(20, 80, 20, 20);
    }

}//end of class