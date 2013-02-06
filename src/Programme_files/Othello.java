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
	public boolean Peut_etre_placer(Pion p) {
		// TODO Auto-generated method stub
		switch (p.getPx()) {
		case 0:
			if (p.getPy() == 0
					&& (ot[p.getPx() + 1][p.getPy()].getEtat() != '*'
							|| ot[p.getPx()][p.getPy() + 1].getEtat() != '*' || ot[p
							.getPx() + 1][p.getPy() + 1].getEtat() != '*')
					|| p.getPy() == 7
					&& (ot[p.getPx() + 1][p.getPy()].getEtat() != '*'
							|| ot[p.getPx()][p.getPy() - 1].getEtat() != '*' || ot[p
							.getPx() - 1][p.getPy() + 1].getEtat() != '*')
					|| p.getPy() < 7
					&& p.getPy() > 0
					&& (ot[p.getPx() + 1][p.getPy() - 1].getEtat() != '*'
							|| ot[p.getPx() + 1][p.getPy() + 1].getEtat() != '*'
							|| ot[p.getPx() + 1][p.getPy()].getEtat() != '*' || ot[p
							.getPx()][p.getPy() - 1].getEtat() != '*'))
				return true;
			break;
		case 7:
			if (p.getPy() == 0
					&& (ot[p.getPx() - 1][p.getPy()].getEtat() != '*'
							|| ot[p.getPx()][p.getPy() + 1].getEtat() != '*' || ot[p
							.getPx() - 1][p.getPy() + 1].getEtat() != '*')
					|| p.getPy() == 7
					&& (ot[p.getPx() - 1][p.getPy()].getEtat() != '*'
							|| ot[p.getPx()][p.getPy() - 1].getEtat() != '*' || ot[p
							.getPx() - 1][p.getPy() - 1].getEtat() != '*')
					|| p.getPy() < 7
					&& p.getPy() > 0
					&& (ot[p.getPx() - 1][p.getPy() - 1].getEtat() != '*'
							|| ot[p.getPx() - 1][p.getPy() + 1].getEtat() != '*'
							|| ot[p.getPx() - 1][p.getPy()].getEtat() != '*' || ot[p
							.getPx()][p.getPy() - 1].getEtat() != '*'))
				return true;
			break;
		default:

			switch (p.getPy()) {
			case 0:
				if (p.getPx() == 0
						&& (ot[p.getPx() + 1][p.getPy()].getEtat() != '*'
								|| ot[p.getPx()][p.getPy() + 1].getEtat() != '*' || ot[p
								.getPx() + 1][p.getPy() + 1].getEtat() != '*')
						|| p.getPx() == 7
						&& (ot[p.getPx() - 1][p.getPy()].getEtat() != '*'
								|| ot[p.getPx()][p.getPy() + 1].getEtat() != '*' || ot[p
								.getPx() - 1][p.getPy() - 1].getEtat() != '*')
						|| p.getPx() < 7
						&& p.getPx() > 0
						&& (ot[p.getPx() - 1][p.getPy() + 1].getEtat() != '*'
								|| ot[p.getPx() + 1][p.getPy() + 1].getEtat() != '*'
								|| ot[p.getPx() + 1][p.getPy()].getEtat() != '*'
								|| ot[p.getPx() - 1][p.getPy()].getEtat() != '*' || ot[p
								.getPx()][p.getPy() + 1].getEtat() != '*'))
					return true;
				break;
			case 7:
				if (p.getPx() == 0
						&& (ot[p.getPx()][p.getPy() - 1].getEtat() != '*'
								|| ot[p.getPx() + 1][p.getPy()].getEtat() != '*' || ot[p
								.getPx() + 1][p.getPy() - 1].getEtat() != '*')
						|| p.getPx() == 7
						&& (ot[p.getPx() - 1][p.getPy()].getEtat() != '*'
								|| ot[p.getPx()][p.getPy() - 1].getEtat() != '*' || ot[p
								.getPx() - 1][p.getPy() - 1].getEtat() != '*')
						|| p.getPx() < 7
						&& p.getPx() > 0
						&& (ot[p.getPx() - 1][p.getPy() - 1].getEtat() != '*'
								|| ot[p.getPx() + 1][p.getPy() - 1].getEtat() != '*'
								|| ot[p.getPx() - 1][p.getPy()].getEtat() != '*' || ot[p
								.getPx()][p.getPy() - 1].getEtat() != '*'))
					return true;
				break;
			default:
				if (ot[p.getPx() + 1][p.getPy()].getEtat() != '*'
						|| ot[p.getPx() - 1][p.getPy()].getEtat() != '*'
						|| ot[p.getPx()][p.getPy() + 1].getEtat() != '*'
						|| ot[p.getPx()][p.getPy() - 1].getEtat() != '*'
						|| ot[p.getPx() + 1][p.getPy() + 1].getEtat() != '*'
						|| ot[p.getPx() - 1][p.getPy() - 1].getEtat() != '*'
						|| ot[p.getPx() + 1][p.getPy() - 1].getEtat() != '*'
						|| ot[p.getPx() - 1][p.getPy() + 1].getEtat() != '*')
					return true;
				else
					return false;
			}
		}
		return false;
	}
	public void reg_hor(Pion p) {
		boolean test = false, test1 = false;
		// droite
		for (int i = p.getPy() + 1; i < 8; i++)
			if (ot[p.getPx()][i] == null || ot[p.getPx()][i].getEtat() == '*') {
				test = false;
				break;
			} else if (ot[p.getPx()][i].getEtat() != p.getEtat()
					&& ot[p.getPx()][i].getEtat() != '*')
				test = true;
			else if (ot[p.getPx()][i].getEtat() == p.getEtat() && test) {
				test1 = true;
				break;
			}

		//System.out.println(" modifiable � droite " + test1);
		if (test1 == true) {
			for (int i = p.getPy() + 1; i < 8
					&& p.getEtat() != ot[p.getPx()][i].getEtat(); i++)
				ot[p.getPx()][i].setEtat(p.getEtat());
		}

		// gauche
		test = false;
		test1 = false;
		for (int i = p.getPy() - 1; i >= 0; i--)
			if (ot[p.getPx()][i] == null || ot[p.getPx()][i].getEtat() == '*') {
				test = false;
				break;
			} else if (ot[p.getPx()][i].getEtat() != p.getEtat()
					&& ot[p.getPx()][i].getEtat() != '*')
				test = true;
			else if (ot[p.getPx()][i].getEtat() == p.getEtat() && test) {
				test1 = true;
				break;
			}

		//System.out.println(" modifiable a gauche " + test1);
		if (test1 == true) {
			for (int i = p.getPy() - 1; i >= 0
					&& p.getEtat() != ot[p.getPx()][i].getEtat(); i--)
				ot[p.getPx()][i].setEtat(p.getEtat());
		}

	}

	
	
	
	
}
