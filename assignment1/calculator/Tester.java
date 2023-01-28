package Assignment1.calculator;

public class Tester {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        float[] nums = {3,5.2f,2};
        float avgOf3Nums = c.findAverage(nums);
        float[] nums1 = {3,5.2f,5,9.5f};
        float avgOf4Nums = c.findAverage(nums1);
        float[] nums2 = {3,4.2f,5,6.5f,9.9f};
        float avgOf5Nums = c.findAverage(nums2);
        System.out.println("AvgOf3Nums= " + avgOf3Nums);
        System.out.println("AvgOf4Nums= " + avgOf4Nums);
        System.out.println("AvgOf5Nums= " + avgOf5Nums);

    }
}

/*
OUTPUT:

AvgOf3Nums= 3.4
AvgOf4Nums= 5.68
AvgOf5Nums= 5.72

* */