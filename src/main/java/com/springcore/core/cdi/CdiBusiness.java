package com.springcore.core.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {
    @Inject
    CdiDAO cdiDao;

    public CdiDAO getCdiDao() {
        return cdiDao;
    }

    public void setCdiDao(CdiDAO cdiDao) {
        this.cdiDao = cdiDao;
    }
}
