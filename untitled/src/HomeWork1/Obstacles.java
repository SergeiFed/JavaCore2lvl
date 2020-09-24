package HomeWork1;

public interface Obstacles {
    int wallHeight = 0;
    int PathLength = 0;

    default int getPathLength() { return PathLength; }
    default int getWallHeight() { return wallHeight; }

    void test(Competitor j);

}
