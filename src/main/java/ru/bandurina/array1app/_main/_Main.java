package ru.bandurina.array1app._main;

import com.sun.source.tree.NewArrayTree;
import ru.bandurina.array1app.service.TasksForArrays;

import java.util.Scanner;

public class _Main {

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        TasksForArrays tasksForArrays = new TasksForArrays();
        tasksForArrays.evenNumbers();
        tasksForArrays.oddNumbers();
        tasksForArrays.primeNumbers();
        tasksForArrays.summNumbers();
        tasksForArrays.diffTheSummEvenAndOddIndex();
        tasksForArrays.numberOfZeros();
    }

}