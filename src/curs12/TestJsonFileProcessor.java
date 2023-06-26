package curs12;

public class TestJsonFileProcessor {

	public static void main(String[] args) {
		
		JsonFileProcessor obj = new JsonFileProcessor();
		obj.writeJsonFile();
		obj.readJson("name");
		obj.readJson("listaObiecte");
		obj.readJson("email");
		System.out.println("------------------------------");
		
		obj.updateJsonFile("email", "altEmail");
		System.out.println("Email after update: ");
		obj.readJson("email");
		
		obj.deleteFromJson("email");
		System.out.println("Email after delete: ");
		obj.readJson("email");

	}

}
