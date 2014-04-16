package unittest.samples;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Greeter {
	
	  private ResourceBundle bundle = null;
	  private Locale currentLocale = null;
	  private Locale defaultLocale = new Locale("en", "US");
	  
	  public String say(String key) {
		    return bundle().getString(key);		  
	  }
	  
	  public String say(String key, Locale locale) {
		  	currentLocale = locale;
		  	return say(key);
	  }

	  private Locale locale() {
		  if (currentLocale == null) {
			  currentLocale = defaultLocale;
		  }
		  return currentLocale;
	  }
	  
	  private ResourceBundle bundle() {
		  	if (bundle == null) {
		  		bundle = ResourceBundle.getBundle("unittest.samples.greetings", locale());
		  	}
		  	return bundle;
	  }

}
