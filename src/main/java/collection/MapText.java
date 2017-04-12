package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
/*
        * 使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
        添加几条信息
        列出所有的员工姓名
        列出所有员工姓名及其工资
        删除名叫 Tom 的员工信息
        输出 Jack 的工资，并将其工资改为 1500 元
        将所有工资低于 1000 元的员工的工资上涨 20%
        */
public class MapText {
    public static void main(String[] args) {
        Map<String,Integer> hashMap= new HashMap<>();
        hashMap.put("tom",900);
        hashMap.put("som",1300);
        hashMap.put("lom",800);
        hashMap.put("bom",1200);
        hashMap.put("jack",1000);

        hashMap.remove("tom");
        hashMap.get("jack");
        hashMap.put("jack",1500);
        for (String s : hashMap.keySet()) {
            System.out.println("姓名 ："+s);
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"工资 :"+hashMap.get(s));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {
            if(stringIntegerEntry.getValue()<1000){
                hashMap.put(stringIntegerEntry.getKey(), (int) ((stringIntegerEntry.getValue())*1.2));
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"工资 :"+hashMap.get(s));
        }
    }
}
