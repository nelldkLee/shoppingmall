package com.cafe24.front.shoppingmall.dto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

public class MapUtil {
	public static <T> T convertMapToObject(Map map, Class<T> object){
			String keyAttribute = null;
			String setMethodString = "set";
			String methodString = null;
			Iterator itr = map.keySet().iterator();
			while(itr.hasNext()){
				keyAttribute = (String) itr.next();
				methodString = setMethodString+keyAttribute.substring(0,1).toUpperCase()+keyAttribute.substring(1);
				try {
					Method[] methods = object.getClass().getDeclaredMethods();
					for(int i=0;i<=methods.length-1;i++){
						if(methodString.equals(methods[i].getName())){
							System.out.println("invoke : "+methodString);
							methods[i].invoke(object, map.get(keyAttribute));
						}
					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			return (T) object;
		}
	
}

