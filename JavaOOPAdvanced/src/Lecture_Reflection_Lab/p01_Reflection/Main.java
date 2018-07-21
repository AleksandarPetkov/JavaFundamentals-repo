package Lecture_Reflection_Lab.p01_Reflection;

import Lecture_IteratorsAndComparators_Lab.p01_Book.Book;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<Book> bookClass = Book.class;
        System.out.println(bookClass.getSimpleName());
        System.out.println(bookClass.getSuperclass().getSimpleName());

        Class[] bookClassInterfaces = bookClass.getInterfaces();
        for (Class bookInt : bookClassInterfaces) {
            System.out.println(bookInt.getSimpleName());
        }

        // New instance by REFLECTION !
        // OLD Variant ->  Book book = bookClass.newInstance();

        // The new one
        Constructor bookConstructor = bookClass.getDeclaredConstructor(String.class, int.class);
        Book b = (Book) bookConstructor.newInstance("BookName", 17); // Cast to Book

        // Get parameters in constructor
        Class[] params = bookConstructor.getParameterTypes();
        for (Class param : params) {
            System.out.println(param.getSimpleName());
        }

        // Fields set And Get
        // 1.Create new insance;
        Book bookOne = Book.class.getConstructor(int.class, String.class).newInstance(123, "Zaglavie");
        Field titleField = Book.class.getDeclaredField("title");
        // 2. Unlock private property
        titleField.setAccessible(true); // make tittle field public!
        Object value = titleField.get(bookOne); // give current instance; get() -> return object
        System.out.println(value);

        //Change title, with method set();
        titleField.set(bookOne, "Change");
        value = titleField.get(bookOne);
        System.out.println(value);
        titleField.setAccessible(false); // come back tittle to private!


        // For methods
        Method[] methods = Book.class.getDeclaredMethods();
//        Method[] methods1 = bookClass.getDeclaredMethods(); <- second variant
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //take method my name:
        Method bookmMthod = Book.class.getDeclaredMethod("toString");
        //Get return Type
        Class returnType = bookmMthod.getReturnType();
        System.out.println(bookmMthod.getName() + " Return type:" + returnType.getSimpleName());

        //Get method params invoke
        //if is public:
        bookmMthod = Book.class.getDeclaredMethod("toString");
//        String result = (String) bookmMthod.invoke(bookClass); // give current instance
        //else
        bookmMthod.setAccessible(true);

        // MODIFIERS
        int currentMod = Book.class.getModifiers();
        // Each modifier is flag bit
        //Check modifier
        boolean chekisPrivate = Modifier.isPrivate(currentMod);
        boolean chekisProtected = Modifier.isProtected(currentMod);
        boolean chekisPublic = Modifier.isPublic(currentMod);
        System.out.println(chekisPrivate);

        //Annotation
        Annotation[] annotations = bookClass.getAnnotations();
        Annotation[] annotationsTest = bookClass.getMethod("toString").getDeclaredAnnotations();

    }
}
