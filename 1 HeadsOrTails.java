/*
 * HeadsOrTails - makes test COUNTITERATION-times to see what sign was more: Head or Tails
 *
 * Version 1.0
 *
 * Date 09.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
public class HeadsOrTails {
	 private int heads=0;
	 private int tails=0;
	
	
	private void makeTest() {
		final int COUNTITERATION=1000;
		
		for(int i=0;i<COUNTITERATION;++i) {
		
			if((int)(Math.random()*2)==1) {
				++heads;
			}
			else  {
				++tails;
			}
		}
	};
	
	
	public static void main(String[] args) {
		
		
		HeadsOrTails headortail=new HeadsOrTails();
	
		
		headortail.makeTest();
		
		System.out.println("Heads: "+headortail.heads);
		System.out.println("Tails: "+headortail.tails);
	}

}
