package com.appspot.dbaseing.server;
import com.google.appengine.api.datastore.*;
import com.google.gwt.rpc.*;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
public class datastore extends RemoteServiceServlet {
	private static DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	private static Key key;
	public void init(){
		
		
		key = KeyFactory.stringToKey("datas");
		Entity entity = new Entity(key);
		
		
		ds.put(entity);
	}
	
}
