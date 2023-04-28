package polimorfismo;

public abstract class padre {
	
	protected int x,y,r; // usar protected cuando hay erencia
	
	public void Pedirdatos() {
		
		x=2;
		y=4;
		y=5;
	}
	
	public abstract void operacion();
	
	public  void resultado() {
		
		System.out.println(r);
	}

}
