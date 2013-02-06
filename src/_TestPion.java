import static org.junit.Assert.*;

import org.junit.Test;

import Programme_files.Pion;

import junit.framework.JUnit4TestAdapter;


public class _TestPion  {

	
	@Test
	public void TestPion() {
		Pion pion= new Pion();
		assertEquals('*',pion.getEtat());
		assertEquals(-1, pion.getPx());
		assertEquals(-1, pion.getPy());
	}
	@Test
	public void TestsetPion()
	{
		
	}

}
