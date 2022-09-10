package reflectionPractice;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Car c1= new Car("Toyota","Camry",2022);
        Field[] f1= c1.getClass().getDeclaredFields();
        for(Field field: f1) {
            System.out.println(field.getName());
           
        }

    }
}