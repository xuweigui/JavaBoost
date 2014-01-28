package com.windrift.interview;

import java.sql.Time;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 6/07/12
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PerformanceTest {
    
    public static void main(String[] args) {

        Map map = new HashMap<Key, Value>();
        
        List<Key> keys = new ArrayList<Key>(3000);
        for (int i = 0; i < 3000; i++) {
            Key key = new Key(i);
            keys.add(key);
            map.put(key, new Value(i));
        }
        
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 3000; i ++) {
            map.get(keys.get(i));
        }
        System.out.print(System.currentTimeMillis() - begin);
        
    }
    
    private static class Key {
        int name;
        public Key(int name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return 1;// if changed to return name; will greatly improve the performance
        }
        
        
    }

    private static class Value {
          int name;
          public Value(int name) {
              this.name = name;
          }
    }
    
}
