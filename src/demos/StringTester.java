package demos;

import java.lang.reflect.Type;
import java.util.*;

public class StringTester {
    public void stringEqualityDemo() {
        // show bytecode pentru diferenta
        String s1 = "Hello";              // String literal
        String s2 = "Hello";              // String literal
        String s3 = s1;                   // same reference
        String s4 = new String("Hello");  // String object
        String mys5 = new String("Hello");  // String object
        boolean a;
        List<String> strings = new ArrayList<>();

        a = s1 == s1;         // true, same pointer
        a = s1 == s2;         // true, s1 and s1 share storage in common pool
        a = s1 == s3;         // true, s3 is assigned same pointer as s1
        a = s1.equals(s3);    // true, same contents
        a = s1 == s4;         // false, different pointers
        a = s1.equals(s4);    // true, same contents
        a = s4 == mys5;         // false, different pointers in heap
        a = s4.equals(mys5);    // true, same contents

        // daca vreti sa vedeti daca String-ul cautat este "Hello"
        // se poate face in urmatoarele moduri
        a = s1.equals("Hello");
        // sau, best practice
        a = "Hello".equals(s1);
        // a doua e best practice pentru ca daca s1 e null
        // nu se va genera NullPointerException
        // (echivalentul unui segfault more or less)
//        String s6 = null;
//        // va genera NullPointerException
//        a = s6.equals("Hello");
//        System.out.println(this);
    }
    public void stringImmutabilityTest() {
        // folositi String daca nu vreti sa modificati
        // (prea des) continutul String-ului
        String s1 = "Beau";
        String s2 = new String("Beau");
        s1.concat(" si petrec");
        s2.concat(" si petrec");
        // diferenta dintre StringBuffer si StringBuilder
        // e ca StringBuffer e thread-safe si StringBuilder nu e
        // therefore, StringBuffer e mai lent decat StringBuilder
        // also, StringBuilder e mai nou
        StringBuffer sb1 = new StringBuffer("Beau");
        sb1.append(" si petrec");
        sb1.insert(4, " dar mai");
        sb1.replace(0, 4, "Nu beau");
        sb1.delete(0, 3);
        sb1.append("a").append("b").append("c");

        StringBuilder builder = new StringBuilder("Si cand mor");
        builder.append(" am valoare");

        s1.indexOf("eau");
        s1.substring(1, 4);

        // PS la laboratorul precedent puteti face ceva de genul
        // daca vreti sa fiti fancy/va e lene sa instantiati separat obiectul
//         new StringTester().stringEqualityDemo();
    }

    public int stringTokenizerDemo() {
        String str = "Ce s-a intamplat, de nu ma mai vrei";
        StringTokenizer tokenizer = new StringTokenizer(str, " \t\n\r,.';:");
        Vector v = new Vector();
        while(tokenizer.hasMoreTokens()) {
            String s = tokenizer.nextToken();
            v.add(s);
        }
        return 0;
    }
    public int vectorDemo() {
        Vector v = new Vector();
        v.add(4);
        v.add("Alex");
        v.add(new StringTester());
        v.add(v);
        boolean a = v.contains(4);
        a = v.contains("nimic");
        a = v.contains(new StringBuffer("A").append("l").append("e").append("x").toString());
        return 0;
    }
    public int instanceOfDemo() {
        // ctrl+h ca sa vezi ierarhia de clase
        Vector v = new Vector();
        boolean a = v instanceof Vector;
        a = v instanceof Object;
        // de discutat despre asta
        a = Double.valueOf(5) instanceof Object;
        a = v instanceof Stack;
        DemoRunner.metoda(5);
        return 0;
    }
}
