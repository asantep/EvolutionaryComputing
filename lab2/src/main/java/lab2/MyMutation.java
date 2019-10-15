package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    int counter = 1;
    double pointer = 0.6;
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        for(double[] solution: population){

            double alpha = 8/Math.pow(counter,pointer);
            if (alpha < 0.4){
                double zigma = random.nextDouble() * 1;
                for (int i=0; i<population.get(0).length; i++) {
                    if (zigma < alpha || zigma > pointer) {
                        solution[i] += random.nextGaussian() * alpha;
                    }
                }
            }
        }
        counter++;
        return population;
    }
}
