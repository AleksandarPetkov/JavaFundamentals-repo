package Lecture_Reflection_Lab.p03_HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Field> fieldsSet = new TreeSet<>(Comparator.comparing(Field::getName));
        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));

        Field[] reflection = Reflection.class.getDeclaredFields();
        for (Field field : reflection) {
           int modifiers = field.getModifiers();
           if (Modifier.isPrivate(modifiers)){
               System.out.println(Modifier.isPrivate(modifiers));
           }
        }

        Method[] allGetters = Reflection.class.getDeclaredMethods();
        for (Method gett : allGetters) {
            if (gett.getName().startsWith("get") && !gett.getReturnType().equals(void.class)
                && gett.getParameterTypes().length == 0){
                getters.add(gett);
            }
        }

        Method[] allSetters = Reflection.class.getDeclaredMethods();
        for (Method sett : allSetters) {
            if (sett.getName().startsWith("set") && sett.getReturnType().equals(void.class)
                    && sett.getParameterTypes().length != 0){
                getters.add(sett);
            }
        }

        System.out.println();
        fieldsSet.forEach(x -> System.out.println(x.getName()));
        getters.forEach(x -> System.out.println(x.getName()));
        setters.forEach(x -> System.out.println(x.getName()));
    }
}
