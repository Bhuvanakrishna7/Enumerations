package com.newPackage;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    enum Languages{
        JAVA, C, PYTHON, CPP
    }

    public static void main(String[] args) {
	// write your code here
        Languages lan=Languages.JAVA;
        switch (lan){
            case JAVA:
                System.out.println("High Priority");
                break;
            case PYTHON:
                System.out.println("Less Python, Better than CPP");
                break;
            case CPP:
                System.out.println("Not Recomended");
                break;
            default:
                System.out.println("Not qualified");
        }

    }
}
