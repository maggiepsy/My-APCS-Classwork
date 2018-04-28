/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017frq3;

/**
 *
 * @author MaggiePu
 */
public class Position {

    public static Position findPosition(int num, int[][] intArr)
    {
        for (int row=0; row < intArr.length; row++)
        {
           for (int col=0; col < intArr[0].length; col++)
           {
                if (intArr[row][col] == num)
                {
                      return new Position(row, col);
                }           
           }      
        }
     return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr)
    {
    Position[][] newArr = new Position[intArr.length][intArr[0].length];
     for (int row=0; row < intArr.length; row++)
     {
           for (int col=0; col < intArr[0].length; col++)
           { newArr[row][col] = findPosition(intArr[row][col]+1, intArr); 
           }
     }
     return newArr;
    }
    
}
