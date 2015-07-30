package org.yfy.memcach.util;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;



public class MemcachedUtil {
	
	private static MemCachedClient client = null;
	static {
		 client = new MemCachedClient();
		String [] addr ={"172.6.0.194:11211"};
        Integer [] weights = {3};
        SockIOPool pool = SockIOPool.getInstance();
        pool.setServers(addr);
        pool.setWeights(weights);
        pool.setInitConn(5);
        pool.setMinConn(5);
        pool.setMaxConn(200);
        pool.setMaxIdle(1000*30*30);
        pool.setMaintSleep(30);
        pool.setNagle(false);
        pool.setSocketTO(30);
        pool.setSocketConnectTO(0);
        pool.initialize();
		
	}
	   
	public  static MemCachedClient getMemcachedClient(){
		return client;   
	}
}
