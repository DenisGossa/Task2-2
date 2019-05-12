
public class FinderNOKnNOD {
			
	private static int findNOK(int a,int b) {
		if(a==0||b==0) {
				System.out.println("Numbers must be >0");
				return 0;
		}
		if(a==b) {
				return a;
		}
		if(a<0) {
				a=-a;
		}	
		if(b<0) {
				b=-b;
		}
		
		int tmpsmaller,tmpbigger,tmp;
		
		if(a<b) {
				tmpsmaller=a;
				tmpbigger=b;
		}
		else	{
				tmpsmaller=b;
				tmpbigger=a;
		}
		
		if(tmpbigger%tmpsmaller==0) {
				return tmpbigger;
		}
		tmp=tmpbigger;
		
		do {
				tmpbigger+=tmp;
								
		}while(tmpbigger%tmpsmaller!=0);
		
		 
		return tmpbigger;
	}
	
	
	
	private static int findNOD(int a,int b) {
		if(a==0||b==0) {
				System.out.println("Numbers must be >0");
				return 0;
		}
		if(a==b) {
				return a;
		}
		if(a<0) {
				a=-a;
		}
		if(b<0) {
				b=-b;
		}
		
		int tmpsmaller,tmpbigger,devider;
		if(a<b) {
				tmpsmaller=a;
				tmpbigger=b;
		}
		else 	{
				tmpsmaller=b;
				tmpbigger=a;
		}
		
		if(tmpbigger%tmpsmaller==0) {
				return tmpsmaller;
		}
		devider=tmpsmaller-1;
		
		
		while(devider>0) {
			
				if(tmpsmaller%devider!=0) {
					--devider;
					continue;
				}
				else if(tmpbigger%devider!=0) {
					--devider;
					continue;
				}
				else break;
						
		}
		return devider;
	}
	
	
	public static void main(String[] args) {
		final int NUM1=26;
		final int NUM2=88;
				
				
		System.out.println("A:"+NUM1+" B:"+NUM2);
		System.out.println("NOK is "+FinderNOKnNOD.findNOK(NUM1,NUM2));
		System.out.println("NOD is "+FinderNOKnNOD.findNOD(NUM1,NUM2));
		
		
		
		
	}

}
