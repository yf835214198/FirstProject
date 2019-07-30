package cn.tedu;

import cn.tedu.entity.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    private static final Person person=new Person();
    /**
     * 这是主方法
     * @param args
     */
    public static void main(String[] args){
//            System.out.println("HelloWorld1111");
//            System.out.println();
        Date date = new Date();
        System.out.println(date);
        say();
        String[] strings={"1","2","3"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        ArrayList<String> list = new ArrayList<>();
    }
    public static void say(){
        List<String> list01=new ArrayList<>();
        list01.add("张三");
        list01.add("李四");
        list01.add("王五");
        list01.add("赵六");
        for (String s : list01) {
            System.out.println(s);
        }
        if (list01 == null) {

        }
        if (list01 != null) {

        }

    }
    public void test01(){

    }
}
