package com.chendi.training.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLoop {
    public static void main(String args[]){
        Map map= new HashMap();
        map.put("Zara", new Double(3434.34));
        map.put("Mahnaz", new Double(123.22));
        map.put("Ayan", new Double(1378.00));
        map.put("Daisy", new Double(99.22));
        map.put("Qadir", new Double(-19.08));

        Set entrySet = map.entrySet();
        System.out.println(entrySet);
        System.out.println(map.keySet());
        Iterator i = entrySet.iterator();

        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());

        }

        double zaraValue=((Double)map.get("Zara")).doubleValue();
        map.put("Zara",new Double(zaraValue+1000));
        System.out.println("New value of Zara"+ map.get("Zara"));



    }
}
