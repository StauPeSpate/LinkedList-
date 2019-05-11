
public class Main {
	
	public static void main(String[] args){
		
		LinkedList < String > strs = new LinkedList < String > ();
		LinkedList < Integer > ints = new LinkedList < Integer > ();
		strs.insertAt(1, "Markus");
		strs.insertAt(2, "Roghenbach");
		strs.insertAt(3, "Faron");
		strs.insertAt(4, "Stephen");
		
		strs.printLink();
	}
	

}
