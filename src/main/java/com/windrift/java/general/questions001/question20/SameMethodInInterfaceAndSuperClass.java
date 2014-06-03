package com.windrift.java.general.questions001.question20;

/**
 * Created by gary on 3/06/14.
 */
public class SameMethodInInterfaceAndSuperClass {
    interface I {
        String toString();
        void m1();
        void m2();
    }

    interface I2 {
        void m2();
    }

    interface I3 {
        String toString();
    }

    class P {
        public void m1() {

        }
    }

    class C extends P implements I, I2, I3 {

        /**
         * You don't even implement m1, as the super class P already done it.
         * Same to toString method which is implemented in super class Object
         */

        @Override
        public void m2() {

        }
    }
}
