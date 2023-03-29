package com.Lntsuffin.genericUtility;

public class PropertyFileKeys {
public enum PropertyFileKeys 
	{
		BROWSER("browser"),URL("url"),USERNAME("username"),PASSWORD("password"),TIMEOUT("timeout"),SHEETNAME("sheetName");

		private String keys;
		private PropertyFileKeys(String keys)
		{
			this.keys=keys;	
		}

		public String convertToString()
		{
			return keys.toString();
		}
	}
}
