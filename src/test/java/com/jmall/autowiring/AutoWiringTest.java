package com.jmall.autowiring;

import com.jmall.base.UnitTestBase;
import org.junit.Test;

public class AutoWiringTest extends UnitTestBase{

    public AutoWiringTest() {
        super("classpath*:spring-autowiring.xml");
    }

    @Test
    public void testSay() {
        AutoWiringService service= super.getBean("autoWiringService");
        service.say("huangfeihong.");


    }

}