import ir.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void test1() {
        ComputerRepairRequest crr = new ComputerRepairRequest();
        crr.setID(1);
        assertEquals(1, crr.getID());
    }

    @Test
    @DisplayName("First Test")
    public void test2() {
        ComputerRepairRequest crr = new ComputerRepairRequest();
        crr.setID(2);
        assertEquals(2, crr.getID());
    }
}
