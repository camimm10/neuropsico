import java.util.ArrayList;

public class BrainPart {
    private String name;
    private ArrayList<Anatomy> anatomyArrayList;
    private ArrayList<Function> functionArray;
    private ArrayList<Disorder> disorderArray;

    public BrainPart(String name) {
        this.name = name;
        this.anatomyArrayList = new ArrayList<>();
        this.functionArray = new ArrayList<>();
        this.disorderArray = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAnatomy(Anatomy anatomy) {
        this.anatomyArrayList.add(anatomy);
    }

    public void addFunction(Function function) {
        this.functionArray.add(function);
    }

    public void addDisorder(Disorder disorder) {
        this.disorderArray.add(disorder);
    }

    @Override
    public String toString() {
        return "BrainPart: " + name + " \n Anatomy: " + anatomyArrayList + " \n Functions: " + functionArray + " \n Disorders: " + disorderArray +"\n";
    }
}
