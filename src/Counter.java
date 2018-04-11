
class Counter {
	int position, step;
	
	//Constructeur "vide"
	Counter() 
	{
		position=0;
		step=1;
	}
	
	// Constructeur avec paramètres
	Counter(int p, int s)
	{
		position=p;
		step=s;
	}
	
	public int getValue(){
		return position;
	}
	
	public void inc() {
		position = position + step; 
	}
	
}
