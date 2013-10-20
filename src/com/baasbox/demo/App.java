package com.baasbox.demo;

import com.baasbox.android.BAASBox;
import com.baasbox.android.BAASBoxConfig;
import com.baasbox.android.BAASBoxConfig.AuthType;

import android.app.Application;

public class App extends Application {
	
	public static BAASBox bbox;
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		BAASBoxConfig config = new BAASBoxConfig();
		//config.API_DOMAIN = "10.0.2.2";//TODO for remote server or to test on device have to be changed to real IP/domain name
		config.API_DOMAIN = "192.168.0.105";
		config.AUTHENTICATION_TYPE = AuthType.SESSION_TOKEN;
		
		bbox = new BAASBox(config, this);
	}
}
