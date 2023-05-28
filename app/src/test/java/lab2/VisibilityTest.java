package lab2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class VisibilityTest {
    @Test
    public void testBookVisibility() {
        Class<Book> clazz = Book.class;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Assert.assertTrue("Field " + field.getName() + " is not private",
                    Modifier.isPrivate(field.getModifiers()));
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Assert.assertTrue("Method " + method.getName() + " is not public",
                    Modifier.isPublic(method.getModifiers()));
        }
    }

    @Test
    public void testLibraryVisibility() {
        Class<Library> clazz = Library.class;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Assert.assertTrue("Field " + field.getName() + " is not private",
                    Modifier.isPrivate(field.getModifiers()));
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Assert.assertTrue("Method " + method.getName() + " is not public",
                    Modifier.isPublic(method.getModifiers()));
        }
    }
}
