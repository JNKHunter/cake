package question8;

import java.util.Arrays;

/**
 * Created by John on 11/23/16.
 */
public class HighestProduct {
    public static void main(String[] args) {
        int[] ints1 = {0,1,4,2,-9,2,5,8}; //160
        int[] ints2 = {0,1,4,2,9,2,5,8}; //360
        int[] ints3 = {-10,-10,4,2,-10,2,-5,-8}; //400

        System.out.println(highestProduct(ints3));
    }

    public static int highestProduct(int[] array){
        int firstLowest = 1;
        int secondLowest = 1;
        int thirdLowest = 1;
        int firstHighest = 1;
        int secondHighest = 1;
        int thirdHighest = 1;

        for(int i : array){

            if(i <= firstLowest && i != 0){
                thirdLowest = secondLowest;
                secondLowest = firstLowest;
                firstLowest = i;
            }else if(i <= secondLowest && i != 0){
                thirdLowest = secondLowest;
                secondLowest = i;
            }else if(i <= thirdLowest && i != 0){
                thirdLowest = i;
            }

            if(i >= firstHighest &&  i != 0){
                thirdHighest = secondHighest;
                secondHighest = firstHighest;
                firstHighest = i;
            }else if(i >= secondHighest &&  i != 0){
                thirdHighest = secondHighest;
                secondHighest = i;
            }else if(i >= thirdHighest &&  i != 0){
                thirdHighest = i;
            }


        }

        //Check for Most positive * 2nd most positive * Next Positive
        int highestProductOfPositives = firstHighest * secondHighest * thirdHighest;
        int highestProductsOfNegNegPos = firstLowest * secondLowest * firstHighest;
        int highestProductsOfNegPosNeg = firstLowest * firstHighest * secondLowest;


        int highestProduct = firstHighest * secondHighest * thirdHighest;
        int lowestProduct = firstLowest * secondLowest * thirdLowest;

        return Math.max(highestProductOfPositives, Math.max(highestProductsOfNegNegPos, highestProductsOfNegPosNeg));
    }
}
