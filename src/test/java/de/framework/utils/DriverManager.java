package de.framework.utils;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    //create a driver variable of type threadlocal<appiumDriver>
    private static ThreadLocal<AppiumDriver> driver =new ThreadLocal<>();

    // Create a getter method for the driver
    public AppiumDriver getDriver(){
        return driver.get();
    }
    //Create a setter method for the driver
    public void setDriver(AppiumDriver driverValue){
        driver.set(driverValue);
    }
    //create a metthod to  initialize the drive
    public void initializeDriver(){
        AppiumDriver driver =null;
        if (driver == null){
            try{
            driver =new AndroidDriver(new ServerManager().getServer().getUrl(),new CapabilitiesManager().getCapabilities());
            //set the ThreadLocal driver variable to  equal to the newly created driver
            DriverManager.driver.set(driver);}
            catch(IOException e){
                e.printStackTrace();
                throw e;

            }
        }
    }

    
    
}
