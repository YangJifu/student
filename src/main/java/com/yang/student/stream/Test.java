package com.yang.student.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        for (int i=1;i<10;i++){
            People p = new People();
            p.setName("张三"+i);
            p.setAge(18+i);
            if(i%2==0){
                p.setSex(1);
            }else{
                p.setSex(0);
            }
            p.setOther(null);
            list.add(p);
        }
        System.out.println(list);
        //最大值：Collectors.maxBy 最小值：Collectors.minBy
        Optional<People> maxAgeOptional = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(People::getAge)));
        People maxAgePeople = null;
        if (maxAgeOptional.isPresent()) {
            maxAgePeople = maxAgeOptional.get();
        }
        //分区
        Map<Boolean, List<People>> collect = list.stream().collect(Collectors.partitioningBy(people -> people.getSex() == 1));
        System.out.println("最大年龄："+maxAgePeople);
        //汇总
        int ageTotal = list.stream().collect(Collectors.summingInt(People::getAge));
        System.out.println("汇总："+ageTotal);
        //IntSummaryStatistics{count=9, sum=207, min=19, average=23.000000, max=27}
        IntSummaryStatistics intSummaryStatistics = list.stream().collect(Collectors.summarizingInt(People::getAge));
        System.out.println(intSummaryStatistics);
        //字符拼接
        //Collectors.joining()：字符串直接连接。
        //Collectors.joining(CharSequence delimiter)：按照字符delimiter进行字符串连接。
        //Collectors.joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)：按照前缀prefix，后缀suffix，并以字符delimiter进行字符串连接。

        // 输出：张三1张三2张三3张三4张三5张三6张三7张三8张三9
        String namesStr1 = list.stream().map(People::getName).collect(Collectors.joining());
        System.out.println(namesStr1);
        // 输出：张三1,张三2,张三3,张三4,张三5,张三6,张三7,张三8,张三9
        String namesStr2 = list.stream().map(People::getName).collect(Collectors.joining(","));
        System.out.println(namesStr2);
        // 输出：[张三1,张三2,张三3,张三4,张三5,张三6,张三7,张三8,张三9]
        String namesStr3 = list.stream().map(People::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(namesStr3);
    }
}
