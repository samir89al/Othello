package Programme_files;

public class Pion {

	private int Px = -1;
	private  char Etat ='*';
	private int Py=-1;

	public Pion(char c, int i, int j) {
		// TODO Auto-generated constructor stub
	 this.Etat=c;
	 this.Px=i;
	 this.Py=j;
	}

	public Pion() {
		// TODO Auto-generated constructor stub
	}

	public char getEtat() {
		// TODO Auto-generated method stub
		return this.Etat;
	}

	public int getPx() {
		// TODO Auto-generated method stub
		
		return this.Px;
	}

	public int getPy() {
		// TODO Auto-generated method stub
		return this.Py;
	}

 
}
