package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/*
  As PersonDao is singleton, Whenever you use personDao.getDdbcConnection you will get a new JdbcConnection instance
  because of the use of the proxy.if not you would get the same instanceperP
* */
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,
       proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJbdcConnection {
    public ComponentJbdcConnection(){
        System.out.println("JDBC Connection");
    }
}
