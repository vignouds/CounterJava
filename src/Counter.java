
class Counter {
	private int position, step;
	
	//Constructeur "vide"
	public Counter() 
	{
		this.position=0;
		this.step=1;
	}
	
	// Constructeur avec paramètres
	public Counter(int p, int s)
	{
		this.position=p;
		this.step=s;
	}
	
	public int getValue(){
		return this.position;
	}
	
	public void inc() {
		this.position = this.position + this.step; 
	}
	
	public String toString() {	
		return "valeur " + this.getValue() + " (increment " + step +")";
	}
	
	public boolean equals(Counter otherCounter) {		
		return this.getValue() == otherCounter.getValue();
	}
}
