package Assignment1.Calculator;

public class Tester {
    public static void main(String []args){
        calculator c = new calculator();

        float[] nums = {3,5.2f,2};
        float avgOf3Nums = c.findAverage(nums);
        float[] nums1 = {3,5.2f,5,9.5f};
        float avgOf4Nums = c.findAverage(nums1);
        float[] nums2 = {3,4.2f,5,6.5f,9.9f};
        float avgOf5Nums = c.findAverage(nums2);
        System.out.println("avgOf3Nums= " + avgOf3Nums);
        System.out.println("avgOf4Nums= " + avgOf4Nums);
        System.out.println("avgOf5Nums= " + avgOf5Nums);


    }
}
