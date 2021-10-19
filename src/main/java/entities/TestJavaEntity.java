package entities;

public class TestJavaEntity {
    private String first;
    private String second;

    public TestJavaEntity() {
    }

    public TestJavaEntity(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "entities.TestJavaEntity{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
