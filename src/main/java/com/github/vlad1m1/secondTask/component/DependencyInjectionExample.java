package com.github.vlad1m1.secondTask.component;

import com.github.vlad1m1.secondTask.service.ServiceA;
import com.github.vlad1m1.secondTask.service.ServiceB;
import com.github.vlad1m1.secondTask.service.ServiceC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionExample {
    @Autowired // Так делать не рекомендуется.
    private ServiceA serviceA;

    private ServiceB serviceB;
    private ServiceC serviceC;

    @Autowired
    public DependencyInjectionExample(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @Autowired
    public void setServiceC(ServiceC serviceC) {
        this.serviceC = serviceC;
    }

    public String demonstrateInject() {
        return String.format("Field: %s, Constructor: %s, Setter: %s",
                serviceA.getServiceA(),
                serviceB.getServiceB(),
                serviceC.getServiceC()
        );
    }
}
