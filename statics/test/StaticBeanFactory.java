package statics.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wqh on 2018/2/7.
 */
public class StaticBeanFactory {
    private static Map<String,Cars> carsMap = new HashMap<String, Cars>() ;
    static {
        carsMap.put("baoma",new Cars("baoma",1000));
        carsMap.put("motou",new Cars("motou",2000));
    }



    public static Cars getCars(String carname){
        return carsMap.get(carname);
    }
}
