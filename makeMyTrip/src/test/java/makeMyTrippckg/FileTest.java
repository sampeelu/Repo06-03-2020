package makeMyTrippckg;

import java.io.IOException;

import org.samyak.com.generaicLib.FilLib;
import org.testng.annotations.Test;

public class FileTest extends FilLib{
	FilLib f = new FilLib();
	@Test
	public void executfile() throws IOException{
		f.getdata("Sheet1", 1,1);
	}

}
