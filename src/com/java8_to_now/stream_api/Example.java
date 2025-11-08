package com.java8_to_now.stream_api;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void sequentialStream() {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.parallelStream()
                .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
    }

    // Intro to Streams
    /*
     * Simply put, streams are wrappers around a data source, allowing us to operate
     * with that data source and making bulk processing convenient and fast.
     * A stream does not store data and, in that sense, is not a data structure. It
     * also never modifies the underlying data source.
     * This functionality – java.util.stream – supports functional-style operations
     * on streams of elements, such as map-reduce transformations on collections.
     * Let’s now dive into few simple examples of stream creation and usage – before
     * getting into terminology and core concepts.
     *
     * Ex)
     * private static Employee[] arrayOfEmps = {
     * new Employee(1, "Jeff Bezos", 100000.0),
     * new Employee(2, "Bill Gates", 200000.0),
     * new Employee(3, "Mark Zuckerberg", 300000.0)
     * };
     *
     * Stream.of(arrayOfEmps);
     *
     * We can also obtain a stream from an existing list:
     *
     * private static List<Employee> empList = Arrays.asList(arrayOfEmps);
     * empList.stream();
     *
     * Note that Java 8 added a new stream() method to the Collection interface.
     * And we can create a stream from individual objects using Stream.of():
     *
     * Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
     * Or simply using Stream.builder():
     *
     * Stream.Builder<Employee> empStreamBuilder = Stream.builder();
     *
     * empStreamBuilder.accept(arrayOfEmps[0]);
     * empStreamBuilder.accept(arrayOfEmps[1]);
     * empStreamBuilder.accept(arrayOfEmps[2]);
     *
     * Stream<Employee> empStream = empStreamBuilder.build();
     *
     */

}

class Car {
    private String vin;
    private int year;
    private String make;
    private String model;
    private String color;
    private int seats;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

class Engine {
    private String type;
    private int horsePower;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

class Transmission {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}