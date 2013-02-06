import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Programme_files.Othello;
import Programme_files.Pion;

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
	
}
