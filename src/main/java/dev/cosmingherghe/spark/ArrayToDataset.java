package dev.cosmingherghe.spark;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.*;

public class ArrayToDataset {

    public void start() {
        SparkSession spark = new SparkSession.Builder()
                .appName("Array To Dataset<String>")
                .master("local")
                .getOrCreate();

        String [] stringList = new String[] {"Banana", "Car", "Glass", "Banana", "Computer", "Car"};

        List<String> data = Arrays.asList(stringList);

        Dataset<String> ds =  spark.createDataset(data, Encoders.STRING());

        Dataset<Row> df = ds.toDF();

        ds = df.as(Encoders.STRING());

        ds.printSchema();
        ds.show();
        df.show();

        Dataset<Row> df2 = ds.groupBy("value").count();
        df2.show();


    }



}