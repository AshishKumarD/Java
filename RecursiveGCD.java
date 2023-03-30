import java.io.*;
 
class RecursiveGCD
{
    
    static int gcd(int a, int b)
    {
      
	System.out.println("a= "+a+" b="+b);
	if (b==0)
		return a;
        return gcd(b, b%a);
	
    }
     
   
    public static void main(String[] args)
    {
        int a = Integer.valueOf(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}

