package curs9;

public interface Angajat {

	void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	public String getEmail();
	
	
	//public void testCeva();
	
	default void printDepartament() {
		System.out.println("QA");
	}
	
}
