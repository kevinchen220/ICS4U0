/*
Vault
Created by: Kevin Chen
Last Modified: October 6, 2020
Description: A wall that looks like a Vault
 */
import becker.robots.*;

public class Vault extends Wall
{
    /*
    Default Constructor
    aCity - The City Vault will be in
    row - The Street Vault will be on
    column - The Avenue Vault will be on
    aDirection - The Direction Vault will be facing
     */
    public Vault(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
        this.setIcon(new VaultIcon());                              //Set to look like VaultIcon
        this.setCanBeCarried(false);                                //Set cannot be carried
        this.setBlocksEntry(true, true, true, true); //Set to block intersection entry from all directions.
    }


}//end of class