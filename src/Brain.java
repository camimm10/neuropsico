import java.util.ArrayList;

public class Brain extends Patient {
    private ArrayList<BrainPart> brainPartArrayList;
    private ArrayList<Disorder> disorderArrayList;
    private ArrayList<Function> functionArray;

    public Brain(String name, int age) {
        super(name, age);
        this.brainPartArrayList = new ArrayList<>();
        this.disorderArrayList = new ArrayList<>();
        this.functionArray = new ArrayList<>();
    }

    public void addBrainPart(BrainPart part) {
        brainPartArrayList.add(part);
    }

    public void addDisorder(Disorder disorder) {
        disorderArrayList.add(disorder);
    }

    public void addFunction(Function function) {
        functionArray.add(function);
    }

    public ArrayList<BrainPart> getBrainParts() {
        return brainPartArrayList;
    }

    public ArrayList<Disorder> getDisorders() {
        return disorderArrayList;
    }

    public ArrayList<Function> getFunctions() {
        return functionArray;
    }

    @Override
    public String toString() {
        return "Patient\n-Name: " + getName() + "\n-Age: " + getAge() + "\n\n" + brainPartArrayList.getFirst() + "\n" + brainPartArrayList.getLast() + "\n";
    }
}
