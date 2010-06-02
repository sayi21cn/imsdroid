package org.doubango.imsdroid.Services;

import org.doubango.imsdroid.events.IRegistrationEventDispatcher;
import org.doubango.imsdroid.events.ISubscriptionEventDispatcher;

public interface ISipService  extends IService, 
IRegistrationEventDispatcher, 
ISubscriptionEventDispatcher
{
	
	byte[] getReginfo();
	byte[] getWinfo();
	
	boolean register();
	boolean unregister();
	
	boolean isRegistered();
}