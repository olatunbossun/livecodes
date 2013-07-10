
public class Sum {
	static int sum;
	
	public void setAdd(int x, int y){
		sum = x + y;	
	}
	public void getAdd(){
		
	}
	
	public static void main (String []args){
		Sum act = new Sum();
		act.setAdd(5,6);
	System.out.println("The sum of x and y is: " +sum);
	}
}
