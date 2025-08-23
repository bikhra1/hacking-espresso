package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {
    public static byte[] serialize(Object obj) throws Exception {
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(arr)){
            output.writeObject(obj);
        }
        return arr.toByteArray();
    }

    public static Object deserialize(byte[] arr) throws Exception {
        try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(arr))){
            return input.readObject();
        }
    }

    public static void test(Object obj) throws Exception {
        deserialize(serialize(obj));
    }
}
