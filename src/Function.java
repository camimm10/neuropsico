import java.util.ArrayList;

public class Function {
    private String name;
    private ArrayList<String> functionArray;

    public Function(String name) {
        this.name = name;
        this.functionArray = new ArrayList<>();
    }

    public void addFunctionDetail(String detail) {
        this.functionArray.add(detail);
    }

    @Override
    public String toString() {
        return "Function: " + name + " - Details: " + functionArray;
    }
}
