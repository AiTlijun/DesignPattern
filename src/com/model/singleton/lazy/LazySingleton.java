package com.model.singleton.lazy;

/**
 * @author lijun
 * @date 2018/10/18 10:43
 
 * @return 
 * @throws
 * @since 
*/
public class LazySingleton {

    private static LazySingleton singleton = null;

    public LazySingleton() {
    }

    public static synchronized LazySingleton getSingleton() {
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
