/**
 * created by Zheng Jiateng on 2018/11/7.
 */
package com.jmall.lifecycle;

public class BeanLifeCycle {//implements InitializingBean, DisposableBean{

    public void defaultInit() {
        System.out.println("Bean defaultInit");
    }

    public void defaultDestory() {
        System.out.println("Bean defaultDestory");
    }

//    public void start() {
//        System.out.println("Bean strat.");
//    }
//
//    public void stop() {
//        System.out.println("Bean stop.");
//    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean destroy.");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean afterPropertiesSet.");
//    }

}
