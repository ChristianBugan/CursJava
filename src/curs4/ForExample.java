package curs4;

public class ForExample {

	public static void main(String[] args) {
		
		
		for(int i = 0; i<10; i++) {
			
			if(i == 5) {
				//break; //intrerupe executia - ma scoate din bucla
			    continue; // face skip
			}
			
			System.out.println(i);
		}

	}

}
