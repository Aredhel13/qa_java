package animalTests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTest {
    Feline feline = new Feline();

    // Проверяем, что метод eatMeat возвращает список значений для Хищника
    @Test
    public void checkFelineEatMeat() throws Exception{
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(felineFood, feline.eatMeat());
    }

    // Проверяем, что метод getFamily возвращает нужное значение
    @Test
    public void checkFelineGetFamily(){
        String families = "Кошачьи";
        Assert.assertEquals(families, feline.getFamily());
    }

    // Проверяем, что метод getKittens() без параметров возвращает 1
    @Test
    public void checkFelineGetKittensWithoutParam(){
        int kittens = 1;
        Assert.assertEquals(kittens, feline.getKittens());
    }

    // Проверяем, что метод getKittens() выполняется при передаче параметров
    @Test
    public void checkFelineGetKittensWithParam(){
        int kittens = 5;
        Assert.assertEquals(kittens, feline.getKittens(kittens));
    }


}
