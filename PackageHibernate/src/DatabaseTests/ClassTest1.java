package DatabaseTests;

import com.tvc.dao.PackageDAO;
import com.tvc.main.java.Package;
import static org.junit.Assert.*;

import org.junit.Test;

public class ClassTest1 {

	PackageDAO packageDAO = null;
	
	@Test
	public void register() {
		packageDAO = new PackageDAO();
		
		Package packToBeSent = new Package();
		packToBeSent.setSender("George");
		packToBeSent.setReceiver("Robin");
		packToBeSent.setCode("GR01");
		packToBeSent.setMessage("We are using Hibernate!");
		
		// Pack returned by our .register() method
		Package returnedPack = packageDAO.register(packToBeSent);
		assertNotNull(returnedPack);
		assertNotNull(returnedPack.getId());
		
	}

}
