package demos;

import java.util.ArrayList;
import java.util.List;

public class DemoRunner {
    private int number;
    private boolean isUsed;
    private String name;
    private StringTester tester;

    @Override
    public String toString() {
        return "DemoRunner{" +
                "number=" + number +
                ", isUsed=" + isUsed +
                ", name='" + name + '\'' +
                ", tester=" + tester +
                '}';
    }

    public static void metoda(int a){

    }

    public static void main(String[] args) {
        StringTester tester = new StringTester();
        // egalitate String-uri
        tester.stringEqualityDemo();
        // imutabilitate String-uri
        tester.stringImmutabilityTest();
        // demo pentru tokenizer
        tester.stringTokenizerDemo();
        // demo pentru vectori
        tester.vectorDemo();
        metoda(5);

    }
}
