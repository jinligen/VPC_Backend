package org.lyg.vpc.process.companyImpl.departmentImpl;

import org.lyg.vpc.controller.company.department.HelloBean;
import org.lyg.vpc.controller.company.department.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBeanImpl implements HelloBean {
    @Autowired
    private HelloService helloService;
    private String say = "123";
    private int hello = 123;
    private int n;

    public String saySomething(int n) {
        this.n = n;
        helloService.testSample(hello);
        return say;
    }

}