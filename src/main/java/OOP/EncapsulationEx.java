package OOP;

public class EncapsulationEx {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing();
        h1.setHeight(1.2f);
        h1.setWeight(65);
        h1.setBmi(calculateBmi(h1));

        System.out.println("The BMI is " + h1.getBmi());

    }

    private static float calculateBmi(HumanBeing h1) {
        return h1.getWeight()/(h1.getHeight()*h1.getHeight());
    }
}
