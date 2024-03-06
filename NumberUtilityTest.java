import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class NumberUtilityTest {


   @Test
   public void testUtilityClass() {
      NumberUtility nu = new NumberUtility(3, 7);
      
      assertEquals(7, nu.larger());
      
      assertFalse(nu.areEven());
      
      assertEquals(3, nu.smaller());
   }
}