package polimorfismo;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// clase padre == new hiija                      
		padre ps = new hija_suma();
		//si no hay polimorfismo es padre ==new padre
		
		ps.Pedirdatos();
		ps.operacion();
		System.out.println("suma");
		ps.resultado();
		
		padre pr = new hija_resta();
		
		pr.Pedirdatos();
		pr.operacion();
		System.out.println("resta");
		pr.resultado();
		
	}

}
