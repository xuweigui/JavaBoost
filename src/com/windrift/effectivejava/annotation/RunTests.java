package com.windrift.effectivejava.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 21/05/12
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunTests {
    public static void main(String[] args) throws Exception {
        test("com.windrift.effectivejava.annotation.Sample");
        test("com.windrift.effectivejava.annotation.Sample2");
    }

    private static void test(String classname) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        Class testClass = Class.forName(classname);
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("INVALID @InstantiationProcess: " + m);
                }
            }

            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("InstantiationProcess %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Exception> excType =
                            m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed++;
                    } else {
                        System.out.printf(
                                "InstantiationProcess %s failed: expected %s, got %s%n",
                                m, excType.getName(), exc);
                    }
                } catch (Exception exc) {
                    System.out.println("INVALID @InstantiationProcess: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
