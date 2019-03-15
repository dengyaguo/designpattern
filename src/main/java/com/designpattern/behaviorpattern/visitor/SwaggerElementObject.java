package com.designpattern.behaviorpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class SwaggerElementObject {
   List<Element> eleList = new ArrayList<Element>();

   public void add(Element element){
       eleList.add(element);
   }
    public  void accept(Visitor visitor){
       for (Element ele : eleList) {
           ele.accept(visitor);
       }
   }
}
