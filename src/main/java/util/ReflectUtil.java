package util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {

    public static Object getFieldValue(Object obj, String name) throws Exception {
        return getFieldValue(obj.getClass(), obj, name);
    }

    public static Object getFieldValue(Class<?> clazz, Object obj, String name) throws Exception {
        Field f = clazz.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(obj);
    }

    public static void setFieldValue(Object obj, String name, Object val) throws Exception {
        setFieldValue(obj.getClass(), obj, name, val);
    }

    public static void setFieldValue(Class<?> clazz, Object obj, String name, Object val) throws Exception {
        Field f = clazz.getDeclaredField(name);
        f.setAccessible(true);
        f.set(obj, val);
    }

    public static Object invokeMethod(Object obj, String name, Class[] parameterTypes, Object[] args) throws Exception {
        return invokeMethod(obj.getClass(), obj, name, parameterTypes, args);
    }

    public static Object invokeMethod(Class<?> clazz, Object obj, String name, Class[] parameterTypes, Object[] args) throws Exception {
        Method m = obj.getClass().getDeclaredMethod(name, parameterTypes);
        m.setAccessible(true);
        return m.invoke(obj, args);
    }

    public static Object newInstance(Class<?> clazz, Class[] parameterTypes, Object[] args) throws Exception {
        Constructor constructor = clazz.getDeclaredConstructor(parameterTypes);
        constructor.setAccessible(true);
        return constructor.newInstance(args);
    }
}