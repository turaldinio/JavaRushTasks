package com.javarush.task.task21.task2102;




import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* 
Сравниваем модификаторы
*/

public class Solution {

    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();

        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true//1 1
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false//

        int methodModifiers = getMainMethod().getModifiers();

        //   System.out.println(methodModifiers);
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        System.out.println("стандартное представление числа" + allModifiers + " " + specificModifier +"\nдвочиное представление числа " +Integer.toBinaryString(allModifiers) + " " + Integer.toBinaryString(specificModifier));
        int mod = allModifiers & specificModifier;
        return mod == specificModifier ? true : false;
    }


    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {

            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
