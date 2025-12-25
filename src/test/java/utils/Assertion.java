package utils;

import org.testng.Assert;

public class Assertion {

    public static void assertEqual(Object actual, Integer expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    public static void assertEqualString(Object actual, String expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

}
