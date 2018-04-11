
public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.getValue();
		System.out.println(counter.getValue());
		counter.inc();
		System.out.println(counter.getValue());
	}
}
