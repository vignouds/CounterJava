class Counter {
	private int position, step;
	private static int globalCounter=-1;

	// Constructeur avec paramètres
	public Counter(int p, int s)
	{
		this.position=p;
		this.step=s;
		
		if(globalCounter==-1) {
			globalCounter=p;
		}
	}
	
		//Constructeur "vide"
	public Counter() 
	{
		this(0,1);
	}
	
	public int getValue(){
		return this.position;
	}
	
	public static int getGlobalCounter() {
		return globalCounter;
	}
	
	public void inc() {
		this.position += this.step; 
		globalCounter += step;
	}
	
	public String toString() {	
		return "valeur " + this.getValue() + " (increment " + step +")";
	}
	
	public boolean equals(Counter otherCounter) {		
		return this.getValue() == otherCounter.getValue();
	}
}
