package Programme_files;

public class Othello {

	private Pion  ot[][]= new Pion[8][8];

	
	
	public Othello() {
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++) {

				if (i == 3 && j == 4 || i == 4 && j == 3)
					ot[i][j] = new Pion('N', i, j);
				else if (i == 4 && j == 4 || i == 3 && j == 3)
					ot[i][j] = new Pion('B', i, j);
				else
					ot[i][j] = new Pion('*', i, j);
			}
		}
	public Pion[][] getOt() {
		// TODO Auto-generated method stub
		return ot;
	}
	
	
	
}
