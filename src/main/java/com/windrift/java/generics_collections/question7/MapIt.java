package com.windrift.java.generics_collections.question7;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Gary Xu
 */
class KeyMaster
{
    public int i;
    public String name;
    public KeyMaster(int i, String name) { this.i = i; this.name = name;}
    public boolean equals(Object o) { System.out.println("in equals of " + name); return i == ((KeyMaster)o).i; }
    public int hashCode() {System.out.println("in hashCode of " + name); return i; }
}

public class MapIt
{
    public static void main(String[] args) {
        Set<KeyMaster> set = new HashSet<KeyMaster>();
        KeyMaster k1 = new KeyMaster(1, "K1");
        KeyMaster k2 = new KeyMaster(2, "K2");
        set.add(k1); set.add(k1);
        set.add(k2); set.add(k2);
        System.out.println(set.size());

        k2.i = 1;
        System.out.println(set.size());

        set.remove(k1);
        System.out.println(set.size());


        set.remove(k2);
        System.out.println(set.size());

        KeyMaster k3 = new KeyMaster(2, "K3");
        set.remove(k3);
        System.out.println(set.size());
    }
}

/*
 in hashCode of K1
in hashCode of K1
in hashCode of K2
in hashCode of K2
2
2
in hashCode of K1
1
in hashCode of K2
1
in hashCode of K3
in equals of K3
1

  */