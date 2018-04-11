
public class Main {
	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2=counter1;
		counter1.inc();
		counter2.inc();
		System.out.println(counter1.toString());
		System.out.println(counter2.toString());
		System.out.println(counter1.equals(counter2));
	}
}
