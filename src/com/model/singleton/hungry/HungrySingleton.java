package com.model.singleton.hungry;

public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton() {
    }
/**
 * @author lijun
 * @date 2018/10/18 10:47
 
 * @return 
 * @throws 
 * @since 
*/
    public static HungrySingleton getSingleton() {
        return singleton;
    }
/**
 * @Author lijun
 * @Description //TODO 11:03
 * @Date 11:03 2018/10/18
 * @Param 
 * @return 
 **/
    public static String  getSingleton2(String param1,String param2) {
        return param1+param2;
    }
}
