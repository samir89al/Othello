package Programme_files;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Othello o = new Othello();
		o.afficher();
		int i = 0, k = -1, l = -1;
		Scanner sc = new Scanner(System.in);
		boolean joueur = true;
		while (true) {
			if (joueur)
				System.out.println("Tour de Noir    --->");
			else
				System.out.println("Tour de Blanc  --->");
			System.out.println("Poser un pion choisir :1");
			System.out.println("Terminer le jeu       :2");
			System.out.println("Abondonner Le jeu     :3");
			System.out.print("Votre choix           :");
			i = sc.nextInt();
			switch (i) {
			case 1:
				while (k < 0 || k > 7) {
					System.out
							.print("saisissez la valeur de x  <valeur  entre 0 et 7>:");
					k = sc.nextInt();
				}
				while (l < 0 || l > 7) {
					System.out
							.print("saisissez la valeur de y  <valeur  entre 0 et 7>:");
					l = sc.nextInt();
				}
				if (joueur) {

					joueur = (!o.AjouterPion(new Pion('N', k, l)));
					System.out.println("la valeur de joueur est " + joueur);
				} else {
					joueur = o.AjouterPion(new Pion('B', k, l));
				}
				k = -1;
				l = -1;
				break;
			case 2:
				System.out.println("le compte est ");
				break;
			case 3:
				if (joueur)
					System.out.println("Noir a gagné");
				else
					System.out.println("Blanc a gagné");
				System.exit(0);
			}
		}
	}

}
