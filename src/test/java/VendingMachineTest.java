import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void whenNickleIsPassedInVendingMachineThenReturnTrue(){
		VendingMachine vendingMachine = new VendingMachine();
		assertEquals(true,vendingMachine.insertNickle());
	}
	
}
