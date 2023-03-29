package com.lnsuffin.gearic.liberary;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Globalvariables {
public static WebDriver driver;
public static Logger logger=null;

public static  FileInputStream inputStream;
public static  Properties properties;
public static  String propertiesFilename=".\\src\\main\\resources\\Environmentvariables\\config.properties";

}
