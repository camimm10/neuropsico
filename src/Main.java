import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear partes del cerebro
        BrainPart frontalLobe = new BrainPart("Frontal Lobe");
        BrainPart occipitalLobe = new BrainPart("Occipital Lobe");

        // Crear anatomía
        Anatomy grayMatter = new Anatomy();
        grayMatter.addAnatomyPart("Gray Matter");

        Anatomy whiteMatter = new Anatomy();
        whiteMatter.addAnatomyPart("White Matter");

        frontalLobe.addAnatomy(grayMatter);
        occipitalLobe.addAnatomy(whiteMatter);

        // Crear funciones
        Function cognitiveFunction = new Function("Cognition");
        cognitiveFunction.addFunctionDetail("Problem Solving");
        cognitiveFunction.addFunctionDetail("Memory Processing");

        Function visualFunction = new Function("Vision Processing");
        visualFunction.addFunctionDetail("Color Detection");
        visualFunction.addFunctionDetail("Depth Perception");

        frontalLobe.addFunction(cognitiveFunction);
        occipitalLobe.addFunction(visualFunction);

        // Crear desórdenes
        Disorder dyslexia = new Disorder("Dyslexia", "Difficulty in reading and interpreting words.");
        Disorder epilepsy = new Disorder("Epilepsy", "Abnormal electrical brain activity causing seizures.");

        frontalLobe.addDisorder(dyslexia);
        occipitalLobe.addDisorder(epilepsy);

        // Crear cerebro
        Brain brain = new Brain("Juana",32);
        brain.addBrainPart(frontalLobe);
        brain.addBrainPart(occipitalLobe);
        brain.addFunction(cognitiveFunction);
        brain.addFunction(visualFunction);
        brain.addDisorder(dyslexia);
        brain.addDisorder(epilepsy);

        // Mostrar información del cerebro
        System.out.println(brain);
    }
}
