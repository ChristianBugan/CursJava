package curs11;

public class Tester<T> {

	T object;

	public Tester(T obj) {
		this.object = obj;
	}
		public static void main(String[] args) {
			
			Tester t1 = new Tester("text");
			Tester t2 = new Tester(123);
		}
		
		
	}

