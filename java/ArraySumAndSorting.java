import java.util.*;
class ArraySumAndSorting
{
public static void main(String args[]){
 int myarray[]={1,3,4,2,5,7,8,6};
 
 //sum of the elements
 int sum=0;
 for(int i=0;i<8;i++)
 sum=sum+myarray[i];
 System.out.println("sum of the elements"+sum);
 
 //sorting of the elements
 Arrays.sort(myarray);
 System.out.println("sorted elemts are"+Arrays.toString(myarray));
 }
}