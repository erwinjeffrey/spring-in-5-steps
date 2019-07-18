package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    JbdcConnection jdbcConnection;

    public JbdcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JbdcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
