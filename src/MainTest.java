import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getLiquidType(){
     Main c = new Main("tea" , 89.5);
     assertEquals("tea",c.getLiquidType());

    }
    @Test
    void getPercentageFull(){
        Main c = new Main("tea" , 89.5);
        assertEquals(89.5,c.getPercentFull(),0.001);

    }

    @Test
    void setLiquidType() {
        Main c = new Main( "Tea",89.5);
        c.setLiquidType("Water");
        assertEquals("Water",c.getLiquidType());
    }
}