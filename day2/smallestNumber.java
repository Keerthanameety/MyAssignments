package week1.day2;
import java.util.Arrays;
public class smallestNumber {

	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];//2nd element because index starts from 0  
		}  
		public static void main(String args[]){  
		int a[]={23,45,67,32,89,22};  
		System.out.println("Second smallest: "+getSecondSmallest(a,6));    
		}}  