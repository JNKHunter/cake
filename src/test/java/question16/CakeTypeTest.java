package question16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 2/7/17.
 */
public class CakeTypeTest {

    private CakeType[] cakeTypes;

    @Before
    public void setUp(){
        cakeTypes = new CakeType[]{
                new CakeType(7, 160),
                new CakeType(3, 90),
                new CakeType(2, 15),
        };
    }

    public int maxDuffelBagValue(CakeType[] types, int capacity){
        int maxValue = 0;

        CakeType curHighestValue = types[0];
        CakeType prevHighestValue = types[0];

        int curHighestPricePerUnitWeight = 0;
        int curPrevHighestPricePerUnitWeight = 0;

        int numberOfHighest = 0;
        int numberOfPrevHighest = 0;

        int curPrice = 0;
        for(int i = 0; i < cakeTypes.length; i++){

            if(cakeTypes[i].getWeight() > capacity){

                curPrice = cakeTypes[i].getValue() / cakeTypes[i].getWeight();

                if(curPrice > curHighestPricePerUnitWeight){
                    prevHighestValue = curHighestValue;
                    curHighestValue = cakeTypes[i];

                    curPrevHighestPricePerUnitWeight = curHighestPricePerUnitWeight;
                    curHighestPricePerUnitWeight = curPrice;
                }

                numberOfHighest = capacity / curHighestValue.getWeight();
                int remainderAfterNumberOfHighest = capacity % curHighestValue.getWeight();

                if(remainderAfterNumberOfHighest > prevHighestValue.getWeight()){
                    numberOfPrevHighest = remainderAfterNumberOfHighest/prevHighestValue.getWeight();
                }
            }
        }

        return (numberOfHighest * curHighestPricePerUnitWeight) + (numberOfPrevHighest * curPrevHighestPricePerUnitWeight);
    }

    @Test
    public void testMaxDuffelBagValue(){

        assertEquals(555,maxDuffelBagValue(cakeTypes,20));

    }

}