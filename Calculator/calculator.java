package Assignment1.Calculator;

public class calculator {
    float findAverage(float[] numbers){

        float  sum = 0f;
        for (float f : numbers)
            sum += f;

        return Math.round((sum / numbers.length) * 100f) / 100f; // rounding  off the Average to 2 decimal places.
    }

    
}
