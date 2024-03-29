package com.syntax.ReviewClass13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // System.out.println(new Person("123","Jason",25,"Programmer"));
        Map<String,Person> personMap= new HashMap<>();
        personMap.put("1",new Person("1","Jason",25,"Programmer"));
        personMap.put("2",new Person("2","James",26,"SDET"));
        personMap.put("3",new Person("3","Mike",28,"PO"));
        personMap.put("4",new Person("4","Adam",22,"QA Manager"));
        personMap.put("5",new Person("5","Ali",21,"Architect"));
        //Getting values in the form of a collection
        Collection<Person> personMapValues =personMap.values();
        //Getting an iterator on collection of values

/*        //Getting an iterator on collection of values
        Iterator<Person> iterator=personMapValues.iterator();
        while (iterator.hasNext()){
            Person person=iterator.next();
            if(person.getAge()>23){
                iterator.remove();
            }
        }*/
        //remove all the persons whose age is greater than 23
        //   personMapValues.removeIf( person -> person.getAge() > 23);
        personMapValues.removeIf( person -> person.getName().contains("m")||person.getName().contains("M")
                ||person.getJob().equals("QA Manager"));
        System.out.println(personMap);

    }
}
