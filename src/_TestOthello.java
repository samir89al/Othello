import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Programme_files.Othello;

import junit.framework.JUnit4TestAdapter;


public class _TestOthello  {

	protected Othello oth_test;
	@Before
	public void setUp() throws Exception {
		oth_test = new Othello();
		System.out.println("@Before: set up ");
	}
	
}
