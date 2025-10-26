package utils;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentTest getTest(){
        return test.get();
    }

    public static void setTest(ExtentTest testInst){
        test.set(testInst);
    }

    public static void removeTest(){
        test.remove();
    }
}
