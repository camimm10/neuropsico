public class Disease {
    private String name;
    private String description;

    public Disease(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Disease: " + name + " - " + description;
    }
}
