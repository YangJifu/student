package com.yang.student.test;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Miracle Yang～ on 2021/9/13 11:03 上午
 */
public class TestController {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start ="2021-09-01 09:00:00";
        String end = "2021-09-01 15:59:59";
        String end1 = "2021-09-11 23:59:59";
        Date s =  format.parse(start);
        Date e = format.parse(end);
        Date e1 = format.parse(end1);
        Date ss = s;
        for (int j=1;j>0;j++){
            for(int i=1;i>0;i++){
                //增加五分钟
                System.out.println("s"+format.format(ss));
                ss = new Date(ss.getTime()+1000*60*5);
                System.out.println("ss"+format.format(ss));
                if(ss.after(e)){
                    break;
                }
            }
            //增加1天
            s = new Date(s.getTime()+1000*60*60*24);
            ss =s;
            e = new Date(e.getTime()+1000*60*60*24);
            if(s.after(e1)){
                break;
            }
        }
    }
}
