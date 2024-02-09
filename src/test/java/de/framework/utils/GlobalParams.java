package de.framework.utils;

public class GlobalParams {
    //Create threadLocal variables of capabilities
    private static ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName= new ThreadLocal<>();
    private static ThreadLocal<String> systemPort= new ThreadLocal<>();

    public void setplatformName(String platform){
        platformName.set(platform);

    }
    public String getplatformName(){
        return platformName.get();
    }
    public void setdeviceName(String device){
        deviceName.set(device);
    }
    public String getdeviceName(){
        return deviceName.get();
    }
    public void setsystemPort(String systemport){
        systemPort.set(systemport);
    }
    public String getsystemPort(){
        return systemPort.get();
    }
    //initialize  the parameters
    public void initializeGlobalParams(){
        GlobalParams params= new GlobalParams();
        params.setplatformName(System.getProperty("platform","Android"));
        params.setdeviceName(System.getProperty("deviceName","Techno"));
        params.setsystemPort("2000");

    }

    
}
