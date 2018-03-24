package br.com.ricardosander;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Spark;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class HelloWorldSparkFreeMarkerStyle {

    public static void main(String[] args) {

        final Configuration configuration = new Configuration(Configuration.VERSION_2_3_27);
        configuration.setClassForTemplateLoading(HelloWorldSparkFreeMarkerStyle.class, "/");

        Spark.get("/hello", (request, response) -> {

            Template helloTemplate = configuration.getTemplate("hello.ftl");

            StringWriter stringWriter = new StringWriter();

            Map<String, Object> map = new HashMap<>();
            map.put("name", "Freemarker");

            helloTemplate.process(map, stringWriter);

           return stringWriter;
        });

    }

}
