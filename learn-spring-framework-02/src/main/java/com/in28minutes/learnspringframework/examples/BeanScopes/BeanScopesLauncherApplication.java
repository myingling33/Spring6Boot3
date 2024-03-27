package com.in28minutes.learnspringframework.examples.BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        BeanScopesLauncherApplication.class);

        System.out.println(context.getBean(NormalClass.class)); // com.in28minutes.learnspringframework.examples.BeanScopes.NormalClass@55b53d44
        System.out.println(context.getBean(NormalClass.class)); // com.in28minutes.learnspringframework.examples.BeanScopes.NormalClass@55b53d44

        System.out.println(context.getBean(PrototypeClass.class)); // com.in28minutes.learnspringframework.examples.BeanScopes.PrototypeClass@482bce4f
        System.out.println(context.getBean(PrototypeClass.class)); // com.in28minutes.learnspringframework.examples.BeanScopes.PrototypeClass@366647c2
        System.out.println(context.getBean(PrototypeClass.class)); // com.in28minutes.learnspringframework.examples.BeanScopes.PrototypeClass@6a6afff2

    }

}
