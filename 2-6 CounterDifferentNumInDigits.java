
public class CounterDifferentNumInDigits {
	
	
	private void  findCounterDifferentNumInDigits(int number) {
		if(number<=0) {
				System.out.println("Value have to be positive natural");
				return;
		}
		
		int tmp,count,valueformatches,currentvalueofdigit;
		
		for(int i=0;i<=9;i++) {
				tmp=number;
				count=0;
				valueformatches=i;
				currentvalueofdigit=i;
			
			
				while(tmp>0) {
					currentvalueofdigit=tmp%10;
					if(currentvalueofdigit==valueformatches) {
							++count;
					}
					tmp/=10;
				
				}
							
			System.out.println("Value "+valueformatches+" "+count +" enteries");
			
		}
	
	
	
	
}
		
	public static void main(String[] args) {
		final int NUMBER=122222225;
		
		CounterDifferentNumInDigits counter=new CounterDifferentNumInDigits ();
		counter.findCounterDifferentNumInDigits(NUMBER);
		
		

	}

}
