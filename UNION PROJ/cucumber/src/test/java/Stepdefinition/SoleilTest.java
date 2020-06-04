package Stepdefinition;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoleilTest {
    Soleil s1 = Soleil.getInstance();
    Soleil s2 = Soleil.getInstance();

    @Test
    public  void TestSingleton(){
        assertEquals(s1,s2);
    }

}
