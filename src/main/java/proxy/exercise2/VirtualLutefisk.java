/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package proxy.exercise2;

public class VirtualLutefisk implements Lutefisk {
    private Lutefisk realLutefisk;

    private Lutefisk realLutefisk() {
        if (realLutefisk == null) {
            realLutefisk = new RealLutefisk();
        }
        return realLutefisk;
    }

    public void eat() {
        realLutefisk().eat();
    }

    public boolean equals(Object obj) {
        return realLutefisk().equals(obj);
    }

    public int hashCode() {
        return realLutefisk().hashCode();
    }

    public String toString() {
        return realLutefisk().toString();
    }
}
