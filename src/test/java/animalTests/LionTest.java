package animalTests;

import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    static Predator feline = Mockito.mock(Predator.class);
    Lion lion;

    public LionTest(Lion lion){
        this.lion = lion;
    }


    @Parameterized.Parameters()
    public static Iterable<Object[]> dataForTest() throws Exception {
        return Arrays.asList(new Object[][]{
                {new Lion("Самец", feline)},
                {new Lion("Самка", feline)},
        });
    }

    // Проверяем, что метод getKittens без параметров возвращает 1
    @Test
    public void checkLionGetKittensWithoutParam() {
        int kittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(kittens, lion.getKittens());
    }
    //Проверяем метод getFood
    @Test
    public void getFoodLionTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(food);
        Assert.assertEquals(food, lion.getFood());
    }


}
