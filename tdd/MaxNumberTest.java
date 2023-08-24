package tdd;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;


public class MaxNumberTest {

    @Test
    public void functiaNuDaNullTest(){
        //given;
        int[] arr={};
        try{
            MaxNumber.maxNumber(arr);
        }catch (IllegalArgumentException e){
            assertEquals("Array este gol",e.getMessage());
        }
    }

    @Test
    public void successMaxNumberTest(){
        //given
        int[] arr = {1, 2, 3, 4, 5};

        //when
        int max = MaxNumber.maxNumber(arr);

        //then
        assertEquals(5, max);
    }

    @Test
    public void successNegativMaxNumberTest() {
        int[] array = {-8,-3,-4,-1};
        int maxim=MaxNumber.maxNumber(array);
        assertEquals(-1,maxim);
    }
    @Test
    public void successMixtMaxNumberTest(){
        int[] array = {-2, -6, 4, 9, 69};

        int maxim=MaxNumber.maxNumber(array);

        assertEquals(69, maxim);
    }
}
