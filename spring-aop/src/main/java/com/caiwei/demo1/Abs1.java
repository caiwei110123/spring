package com.caiwei.demo1;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/31  下午3:21
 * @Version 1.0
 */
@Service
public class Abs1 {

    Map<String,String>  map = new ConcurrentHashMap<String, String>();
    public Map<String,String> getMap(){
        return map;
    }
    public  void set(String key,String value) {
        if (map.equals(null)) {
            map = new ConcurrentHashMap<String, String>();
        }
        map.put(key,value);
    }

}
