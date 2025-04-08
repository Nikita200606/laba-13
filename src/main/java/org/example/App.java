package org.example;


    public class App {
        public static void main(String[] args) {
            Tester.printStaticInfo();
            Tester tester = new Tester("lIONEL", "MESSI", 6, "London is a capital of the Great britan", 5000.0);
            tester.printInfo(true);
        }
    }
