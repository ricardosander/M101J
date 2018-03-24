package br.com.ricardosander;

import spark.Spark;

public class HelloWorldSparkStyle {

    public static void main(String[] args) {

        Spark.get("/hello", (request, response) -> "Hello World from Spark.");

    }
}
