package com.in28minutes.learnspringframework.SpringXMLConfiguration;

import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLauncherApplication {

    public static void main(String[] args) {
        var context = new
                ClassPathXmlApplicationContext("contextConfiguration.xml");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("game"));
        context.getBean(GameRunner.class).run();

    }
}
