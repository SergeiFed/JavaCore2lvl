package lesson1.enums;

public enum Planets {
    Mercury(0), Venus(0), Earth(1),
    Mars(2), Jupiter(79), Saturn(8),
    Uranus(6), Neptune(2);

    private int sputnikCount;

    Planets(int sputnikCount) {
        this.sputnikCount = sputnikCount;
    }

    public int getSputnikCount() {
        return sputnikCount;
    }
}
