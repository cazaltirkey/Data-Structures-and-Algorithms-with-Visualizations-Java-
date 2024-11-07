package Introduction_1;

public class Time_Complexity_of_an_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double now = System.currentTimeMillis();
		
		Time_Complexity_of_an_Algorithm demo = new Time_Complexity_of_an_Algorithm();
		System.out.println(demo.findSum(99999));
		
		System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millisecs. ");
	}

	public int findSum(int n) {
		return n * ( n + 1 )/2 ;
	}
}
