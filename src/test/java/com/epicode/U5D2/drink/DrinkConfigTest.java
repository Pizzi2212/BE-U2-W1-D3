package com.epicode.U5D2.drink;


import com.epicode.U5D2.entities.Drink;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DrinkConfigTest {
    @Autowired
    @Qualifier("lemonade")
    private Drink lemonade;

    @Autowired
    @Qualifier("water")
    private Drink water;

    @Autowired
    @Qualifier("wine")
    private Drink wine;

    @Test
    @DisplayName("Test drink lemonade bean")
    public void testDrinkLemonadeBean() {
        assertEquals("Lemonade", lemonade.getName());
        assertEquals(607, wine.getCalories());
        assertEquals(1.29, water.getPrice());
    }
        @ParameterizedTest
        @CsvSource({
                "Lemonade, 1.29, 128",
                "wine, 7.49, 607",
                "water, 1.29,0 "
        })
        @DisplayName("Test different drink bean")
        public void testDrinkLemonadeBean(String name, double price, int calories) {
            Drink d = new Drink(name, calories, price);
            assertEquals(name, d.getName());
            assertEquals(price, d.getPrice());
            assertEquals(calories, d.getCalories());
        }
}
