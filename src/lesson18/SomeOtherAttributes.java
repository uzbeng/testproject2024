package lesson18;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

@Test(groups = {"UI"})
public class SomeOtherAttributes {

    @Test(priority = 4)
    public void testAttributes1() {
        System.out.println("test1");
    }

    @Test(priority = 2)
    public void testAttributes4() {
        System.out.println("test4");
    }

    @Test(priority = 3)
    public void testAttributes2() throws IOException {
        System.out.println("test2");
        throw new IOException("test2");
    }

    @Test(priority = 1)
    public void testAttributes3() {
        System.out.println("test3");
        Assert.fail();
    }
}
