package com.neo.springbootthymeleaf;

import com.neo.Utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootThymeleafApplicationTests {
    @Autowired
    private RedisUtils redisUtils;
    @Test
    public void contextLoads() {
    }
    @Test
    public void set(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        System.out.println(calendar.getTime());
        Date date=calendar.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }
    @Test
    public void get(){
    }

}
