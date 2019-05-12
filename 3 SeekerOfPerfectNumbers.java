
public class SeekerOfPerfectNumbers {
		final int UPPERBOUND=10000;
	
	
	private void findPerfectNumber() {
		for(int var=1;var<UPPERBOUND;++var) {
				int num=var;
				int sumofdeviders=0;
			
				for(int i=1;i<num;i++) {
										if(num%i==0) {
											sumofdeviders+=i;
														continue;
										}
				}
		
				if(sumofdeviders == num) {
									System.out.println("Perfect num is: "+num );
				}	
				else {continue;}
		}
	System.out.println("END");	
	}
	
	public static void main(String[] args) {
	
		SeekerOfPerfectNumbers seeker=new SeekerOfPerfectNumbers();
		seeker.findPerfectNumber(); 
	
		
	}
	
}
