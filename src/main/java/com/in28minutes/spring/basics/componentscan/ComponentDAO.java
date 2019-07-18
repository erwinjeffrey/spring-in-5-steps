package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    ComponentJbdcConnection jdbcConnection;

    public ComponentJbdcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setComponentJbdcConnection(ComponentJbdcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
