package proxy.exercise1;

public class VirtualLutefisk implements Lutefisk {
    private Lutefisk realLutefisk;

    private Lutefisk realLutefisk() {
        if (realLutefisk == null) realLutefisk = new RealLutefisk();
        return realLutefisk;
    }

    @Override
    public void eat() {
        realLutefisk().eat();
    }

    @Override
    public int hashCode() {
        return realLutefisk().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return realLutefisk().equals(obj);
    }

    @Override
    public String toString() {
        return realLutefisk().toString();
    }
}
