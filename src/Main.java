
public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		System.out.println(counter.getValue());
		counter.inc();
		counter2.inc();
		System.out.println(counter.getValue());
		System.out.println(counter.toString());
		System.out.println(counter.equals(counter2));
	}
}
