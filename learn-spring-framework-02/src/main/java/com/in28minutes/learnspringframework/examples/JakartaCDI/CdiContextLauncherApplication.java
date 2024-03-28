package com.in28minutes.learnspringframework.examples.JakartaCDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component
@Named
class BusinessService {

    private DataService1 dataService1;

    public DataService1 getDataService1() {
        return dataService1;
    }

    //@Autowired
    @Inject
    public void setDataService1(DataService1 dataService1) {
        System.out.println("Setter Injection");
        this.dataService1 = dataService1;
    }
}

//@Component
@Named
class DataService1 {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(BusinessService.class).getDataService1());
    }
}
