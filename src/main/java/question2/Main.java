package question2;

/**
 * Created by John on 11/10/16.
 */
public class Main {

    public static void main(String[] args) {
        int[] ints = {5, 7, 3, 4};
        int[] products = getProductsOfAllIntsExceptAtIndex(ints);

        for (int cur : products) {
            System.out.println(cur);
        }
    }


    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

        int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

        int productSoFar = 1;
        for (int i = 0; i < intArray.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar *= intArray[i];
        }

        productSoFar = 1;
        for (int i = intArray.length - 1; i >= 0; i--) {
            productsOfAllIntsExceptAtIndex[i] *= productSoFar;
            productSoFar *= intArray[i];
        }

        return productsOfAllIntsExceptAtIndex;
    }
}

