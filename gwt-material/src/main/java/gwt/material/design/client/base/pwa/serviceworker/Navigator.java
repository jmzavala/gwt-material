package gwt.material.design.client.base.pwa.serviceworker;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

//TODO Need to transfer this at GMD JQuery
@JsType(isNative=true, namespace= GLOBAL, name="navigator")
public class Navigator {
	
	@JsProperty
	public static ServiceWorkerContainer serviceWorker;
	
	

}