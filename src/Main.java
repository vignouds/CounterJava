public class Main {
	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(0,1);
		System.out.println("Compteur global avant incrémentation : " + Counter.getGlobalCounter());
		counter1.inc();
		System.out.println("Compteur global : " + Counter.getGlobalCounter());
		counter1.inc();
		System.out.println("Compteur global : " + Counter.getGlobalCounter());
		counter1.inc();
		System.out.println("Compteur global : " + Counter.getGlobalCounter());
		counter2.inc();
		System.out.println(counter1.toString());
		System.out.println(counter2.toString());
		System.out.println(counter1.equals(counter2));
		System.out.println("Compteur global : " + Counter.getGlobalCounter());
	}
}
