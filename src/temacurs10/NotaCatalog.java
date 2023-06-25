package temacurs10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/* Scriem un program care reprezinta un catalog.
 * Contine numele si notele unor elevi ( un nume si o nota asociata de fiecare)
 * 
 * Intrebam elevul ce nota a luat.
 * 
 * Daca elevul nu este in catalog, il adaugam noi cu tot cu nota si printa:
 *    "Nu aveai nota, ti-am trecut acum!" 
 *    
 * Daca elevul este deja in catalog si noua nota este mai mare decat nota din catalog, facem update
 *   catalogului cu noua nota
 *   
 *       La final indiferent de situatie printam catalogul.
 */

public class NotaCatalog {

	public static void main(String[] args) {
		
		Map<String, Integer> catalog = new HashMap<>();

        // date existente in catalog
        catalog.put("Ion", 8);
        catalog.put("Maria", 9);
        catalog.put("Oana", 10);
        catalog.put("Cristi", 7);
        catalog.put("Dragos", 5);
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele elevului: ");
        String numeElev = scanner.nextLine();

        System.out.println("Introduceti nota elevului: ");
        int nota = scanner.nextInt();

        if (!catalog.containsKey(numeElev)) {
            catalog.put(numeElev, nota);
            System.out.println("Nu aveai nota, ti-am trecut acum!");
        } else {
            int notaExistenta = catalog.get(numeElev);
            if (nota > notaExistenta) {
                catalog.put(numeElev, nota);
            }
        }
        
        //Verificam daca numele elevului exista deja in catalog utilizand metoda containsKey(). 
        //Daca nu exista, adaugam perechea cheie-valoare in map și afișam un mesaj corespunzator. 
        //Daca elevul exista deja în catalog, verificam dacă noua nota este mai mare decat cea existenta și, 
        //in caz afirmativ, facem actualizarea notei.

        System.out.println("Catalogul final:");
        for (Map.Entry<String, Integer> entry : catalog.entrySet()) {
            System.out.println("Elev: " + entry.getKey() + ", Nota: " + entry.getValue());
        }
		
        //La final, afișam catalogul complet utilizând un for-each loop pentru a itera prin toate perechile cheie-valoare din map și a le afișa in consola.

	}

}
