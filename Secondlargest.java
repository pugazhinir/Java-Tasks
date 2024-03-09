public class Secondlargest{
public static void main(String[]args){

int[] numbers= {10,5,3,8,7};

int Largest = Integer.MIN_VALUE;
int SecondLargest =Integer.MIN_VALUE;

for(int num:numbers){       //for each loop

if(num>Largest){
SecondLargest=Largest;        // if num >largest update both largest and second largest 
Largest=num;
}

else if(num>SecondLargest && num!=Largest){
SecondLargest=num;
}
}

if(SecondLargest==Integer.MIN_VALUE){
System.out.println("No second largest element found:");
}else{
System.out.println("the second largest number is :" +  SecondLargest);
}
}
}