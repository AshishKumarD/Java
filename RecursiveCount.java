import java.util.*;
class RecursiveCount{
	
	static int count(int n){
	if(n>0)
	   System.out.print(count(n-1)+" ");

	return n+1;
	 
	
	}

	public static void main(String args[]){
	count(Integer.parseInt(args[0]));	
	}
}
//n=5
//count(5)+" " +> count(4)+" "
//count(4)=> count(3)+" "/
//count(3)=> count(2)+" "/
//count(2)=> count(1)+" "/
//count(1)=> count(0)+" "/

//count(0)=> 1+" "

//1 2 3 4 5 