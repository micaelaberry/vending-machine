import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	private VendingMachine vendingMachine;
	
	@Before
	public void setUp(){
		vendingMachine = new VendingMachine();
	}

	@Test
	public void whenNickleIsPassedInVendingMachineThenReturnTrue(){
		assertTrue(vendingMachine.insertNickle());
	}
	
	@Test
	public void whenDimeIsPassedInVendingMachineThenReturnTrue(){
		assertTrue(vendingMachine.insertDime());
	}
	
	@Test
	public void whenQuarterIsPassedInVendingMachineThenReturnTrue(){
		assertTrue(vendingMachine.insertQuarter());
	}
	
	@Test
	public void whenPennyIsPassedInVendingMachineThenReturnFalse(){
		assertFalse(vendingMachine.insertPenny());
	}
	
	@Test
	public void whenGetDispalyIsCalledThenInsertCoinIsDisplayed(){ 
		assertTrue("actual "+ vendingMachine.getDisplay(), vendingMachine.getDisplay().equals("INSERT COIN"));
	}
	
	@Test
	public void insertNickleIntoTheVendingMachineDisplaySaysFiveCents(){
		vendingMachine.insertNickle();
		assertTrue(vendingMachine.getDisplay().equals("0.05"));
	}
	
	@Test
	public void insertDimeIntoTheVendingMachineDisplaySaysTenCents(){
		vendingMachine.insertDime();
		assertTrue("actual "+ vendingMachine.getDisplay(), vendingMachine.getDisplay().equals("0.1"));
	}
	
	@Test
	public void insertQuarterIntoTheVendingMachineDisplaySaysTwentyFiveCents(){
		vendingMachine.insertQuarter();
		assertTrue(vendingMachine.getDisplay().equals("0.25"));
	}
	
	@Test
	public void whenMultipleCoinsOfTheSameValueAreInserted(){
		vendingMachine.insertQuarter();
		vendingMachine.insertQuarter();
		assertTrue("actual "+ vendingMachine.getDisplay(), vendingMachine.getDisplay().equals("0.5"));		
	}
	
	@Test
	public void whenMultipleCoinsOfDifferentValuesAreInserted(){
		vendingMachine.insertQuarter();
		vendingMachine.insertDime();
		assertTrue("actual "+ vendingMachine.getDisplay(), vendingMachine.getDisplay().equals("0.35"));
	}
	
	
	
	
}
