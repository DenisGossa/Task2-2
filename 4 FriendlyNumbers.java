
public class FriendlyNumbers {

	public static void main(String[] args) {
		final int MINBOUNDER=1;
		final int MAXBOUNDER=20000;
		
		/*��������� ����� � �����*/
		
		for(int var=MINBOUNDER;var<MAXBOUNDER;++var) {
				int firstnum=var;
				int sumofdeviders1number=0;
				int sumofdeviders2number=0;
		
		/*��������� �� �������� 1 num*/
				for(int i=1;i<firstnum;i++) {
									if(firstnum%i==0) {
											/*��������� ����� ���������*/
											sumofdeviders1number+=i;
											continue;
									} 
				}
				if(sumofdeviders1number==firstnum) {
							continue;
				}/*���������� 6;28*/
		
		
		/* �������� ������ ����� (����� ��������� 1 num)*/
				int secondnum=sumofdeviders1number;
				for(int i=1;i<secondnum;i++) {
									if(secondnum%i==0) {
											//��������� ����� ���������	
											sumofdeviders2number+=i;
											continue;
									} 
		}
		/*�������� ��������*/
		if(sumofdeviders2number==firstnum) {
			System.out.println(firstnum +" "+sumofdeviders1number+" -Friends numbers");
		
		}
		
		
		}
		
		
		System.out.println("End");
		
	}

}
