class Evennumbers {  
public static void main(String args[])   
{  
int number=100;  
System.out.print("List of Even numbers from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
//logic to check if the number is Even  
//if i%1 is not equal to zero, the number is Even  
if (i%2!=0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}  