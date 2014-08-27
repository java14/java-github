//Calculating the sum of the array elements
//SumArray.java

public class SumArray
{
   public static void main(String[] args)
   {
      int[] numbers = {100,750,250,80,27,43,93}
      int sum = 0;
      
      //sum the array elements using the enhanced for loop
      for(int val: numbers)
         sum += val;
         
      //Print results
      System.out.println("The sum of the elements of the array numbers is " + sum);
   }
}