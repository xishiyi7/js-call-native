package com.xishiyi7.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class JsCallNative extends CordovaPlugin {

	private static CordovaWebView webView;

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

		webView = this.webView;

        if (action.equals("run")) {
			webView.sendJavascript("javascript:sayHi()");
            return true;
        }              
        return false;
    }

	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		this.webView = webView;
	}
}