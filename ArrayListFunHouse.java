//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Saahil Kakaria

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
  //Factors
  public static ArrayList<Integer> getListOfFactors(int number)
  {
    //create arraylist
    ArrayList<Integer> arrayListNums = new ArrayList<Integer>();
    //for loop from 2 to number
    for(int i=2; i<number; i++)
    {
      //if number divided by i is 0 add i to the arraylist
      if(number%i == 0)
      {
        arrayListNums.add(i);
      }
    }
    return arrayListNums;
  }
  //Composite Numbers
  public static void keepOnlyCompositeNumbers( List<Integer> nums )
  {
    //System.out.println("List of factors" + this.getListOfFactors(nums.get(0)));
    //for loop from the end of the loop to the beginning
    for(int n=nums.size()-1; n>=0; n--)
    {
      if(getListOfFactors(nums.get(n)).size() == 0)
      {
        nums.remove(n);
      }
    }
  }
}