import java.util.Scanner;


public class Sum1 {
int x,y, sum ;
Scanner s = new Scanner(System.in);

public void add(){
	System.out.println("Please enter the value for x");
	x= s.nextInt();
	System.out.println("Please enter the value for y");
	y= s.nextInt();
	sum = x + y ;
	System.out.println("The sum of x and y is:" +sum);
}
public static void main (String []args){
	Sum1 act = new Sum1();
	act.add();
}
}
