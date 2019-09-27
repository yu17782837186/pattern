package cn.com.pattern;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestAllSingles  {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
//        SingleDemo01 sd = SingleDemo01.getInstance();
//        SingleDemo01 sd2 = SingleDemo01.getInstance();
//        System.out.println(sd);
//        System.out.println(sd2);
//        System.out.println(sd == sd2);
//        SingleDemo02 sd3 = SingleDemo02.getInstance();
//        SingleDemo02 sd4 = SingleDemo02.getInstance();
//        System.out.println(sd3);
//        System.out.println(sd4);
//        System.out.println(sd3 == sd4);
//        SingleDemo03 sd5 = SingleDemo03.getInstance();
//        SingleDemo03 sd6 = SingleDemo03.getInstance();
//        System.out.println(sd5);
//        System.out.println(sd6);
//        System.out.println(sd5 == sd6);
//        SingleDemo04 sd7 = SingleDemo04.getInstance();
//        SingleDemo04 sd8 = SingleDemo04.getInstance();
//        System.out.println(sd7);
//        System.out.println(sd8);
//        System.out.println(sd7 == sd8);
//
//        System.out.println(SingleDemo05.INSTANCE == SingleDemo05.INSTANCE);
        SingleDemo01 sd = SingleDemo01.getInstance();
        SingleDemo01 sd2 = SingleDemo01.getInstance();
        System.out.println(sd);
        System.out.println(sd2);
//        //通过反射破解单例模式
//        Class<SingleDemo01> clazz =(Class<SingleDemo01>) Class.forName("cn.com.pattern.SingleDemo01");
//        Constructor<SingleDemo01> c = clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);
//        SingleDemo01 s1 = c.newInstance();
//        SingleDemo01 s2 = c.newInstance();
//        System.out.println(s1);
//        System.out.println(s2);

        //通过反序列化来破解单例
        //序列化
        FileOutputStream fos = new FileOutputStream("F:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sd);
        oos.flush();
        oos.close();
        fos.close();
        //反序列化
        FileInputStream fis = new FileInputStream("F:/a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingleDemo01 s1 = (SingleDemo01) ois.readObject();
        System.out.println(s1);
        ois.close();
        fis.close();
    }
}
