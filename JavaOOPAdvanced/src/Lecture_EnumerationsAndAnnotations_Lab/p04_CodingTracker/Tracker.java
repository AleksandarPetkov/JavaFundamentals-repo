package Lecture_EnumerationsAndAnnotations_Lab.p04_CodingTracker;

import java.lang.reflect.Method;

public class Tracker {

    public static void printAuthors(Class<?> cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method method : methods) {
            Author author = method.getDeclaredAnnotation(Author.class);
            if (author != null) {
                System.out.println(author.name());
            }
        }
    }
}
