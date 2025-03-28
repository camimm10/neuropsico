import java.util.ArrayList;

public class Anatomy {
    private ArrayList<String> anatomyArrayList;

    public Anatomy() {
        this.anatomyArrayList = new ArrayList<>();
    }

    public ArrayList<String> getAnatomyArrayList() {
        return anatomyArrayList;
    }

    public void setAnatomyArrayList(ArrayList<String> anatomyArrayList) {
        this.anatomyArrayList = anatomyArrayList;
    }

    public void addAnatomyPart(String part) {
        this.anatomyArrayList.add(part);
    }

    @Override
    public String toString() {
        return "Anatomy parts: " + anatomyArrayList;
    }
}
