package com.CoreCV;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    @org.junit.Test
    public void dateTest(){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String out = df.format(new Date());
        System.out.println(out);

    }

}
