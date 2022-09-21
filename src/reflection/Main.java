package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Car c1= new Car("Toyota","Camry",2022);
        Field[] f1= c1.getClass().getDeclaredFields();
        for(Field field: f1) {
            if(field.getName().equals("make")) {
                field.setAccessible(true); //make field accessible by calling setAccessible method
                field.set(c1,"Honda");
            }
        }
        Method[] m1 =c1.getClass().getDeclaredMethods();
        for (Method method : m1) {
            if(method.getName().equals("start")) {
                method.setAccessible(true);
                method.invoke(c1);
            }
            //get all methods
            System.out.println(method.getName());
        }
        System.out.println("----------------------");


        //using class literals
        //Method m2 = Car.class.getMethod("start", Object.class);



        System.out.println("----------------------");
        System.out.println(c1.getMake());
        System.out.println("----------------------");
        System.out.println(c1.getClass().getModifiers());
    }
}