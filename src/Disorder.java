public class Disorder {
    private String name;
    private String description;

    public Disorder(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Disorder: " + name + " - " + description;
    }
}
