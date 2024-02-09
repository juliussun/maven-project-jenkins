import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.smu.mscda.Main;

public class CapitalizeAndMD5hex {
    private String INPUT = "smu";

    @Test
    public void testCapitalize(){
        assertEquals("Smu", Main.Captalize(INPUT));
    }

    @Test
    public void testGenerateMD5Hex(){
        assertEquals("3773300c2f413cc7136f8d74b305519c",Main.GenerateMD5hex(INPUT));
        
    }
}
