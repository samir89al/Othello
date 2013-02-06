import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Programme_files.Othello;
import Programme_files.Pion;

import junit.framework.Assert;
import junit.framework.JUnit4TestAdapter;


public class _TestOthello  {

	protected Othello oth_test;
	@Before
	public void setUp() throws Exception {
		oth_test = new Othello();
		System.out.println("@Before: set up ");
	
	}
	
@Test
public void TestOthello() throws Exception
{
	
	for (int i = 0; i < 8; i++)
		for (int j = 0; j < 8; j++) {
			if (i == 3 && j == 4 || i == 4 && j == 3)
				assertTrue(new Pion ('N', i, j).equals(oth_test.getOt()[i][j])) ;
			else if (i == 4 && j == 4 || i == 3 && j == 3)
				assertTrue(new Pion('B', i, j).equals(oth_test.getOt()[i][j]) );
			else
				assertTrue(new Pion('*', i, j).equals(oth_test.getOt()[i][j]) );
		}
}
@Test 
public void TestPeut_etre_placer(){
    	assertFalse(oth_test.Peut_etre_placer(new Pion('B',0,0)));
    	assertTrue(oth_test.Peut_etre_placer(new Pion('B',5,5)));
}

@Test
public void TestReg_Hor(){
	/*Test pour vérification de la regle de transformation horizontale coté gauche*/
	Othello othe_1 = new Othello();
	othe_1.getOt()[4][5]=new Pion('N', 4, 5);
	othe_1.reg_hor(new Pion('N', 4, 5));
	
	oth_test.getOt()[4][5].setEtat('N');
	oth_test.getOt()[4][5].setPx(4);
	oth_test.getOt()[4][5].setPy(5);
	oth_test.getOt()[4][4].setEtat('N');
	for (int j=0; j<8;j++){
		for(int i=0;i<8;i++ ){
			Assert.assertTrue(oth_test.getOt()[i][j].equals(othe_1.getOt()[i][j]));
			
			
		}
		}
	
	/*Test pour vérification de la regle de transformation horizontale coté droit*/
	
	othe_1 = new Othello();
	oth_test = new Othello();
	othe_1.getOt()[3][2]=new Pion('N', 3, 2);
	othe_1.reg_hor(new Pion('N', 3, 2));
		
	oth_test.getOt()[3][2].setEtat('N');
	oth_test.getOt()[3][2].setPx(3);
	oth_test.getOt()[3][2].setPy(2);
	oth_test.getOt()[3][3].setEtat('N');
	for (int j=0; j<8;j++){
		for(int i=0;i<8;i++ ){
			Assert.assertTrue(oth_test.getOt()[i][j].equals(othe_1.getOt()[i][j]));
			

		}
		}
	
}
}
