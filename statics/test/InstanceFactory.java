package statics.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wqh on 2018/2/7.
 */
public class InstanceFactory {
    private Map<String , Cars> carsMap = null ;

    public InstanceFactory() {
        carsMap = new HashMap<>();
        carsMap.put("baoma",new Cars("baoma",1000));
        carsMap.put("motou",new Cars("motou",2000));
    }
    public Cars getCar(String carname){

      return   carsMap.get(carname);
    }


}
