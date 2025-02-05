package com.epicode.U5D2.pizza;


import com.epicode.U5D2.entities.Pizza;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PizzaConfigTest {
    @Autowired
    @Qualifier("pizza_margherita")
    private Pizza pizza;

    @Test
    @DisplayName("Test pizza margherita bean")
    public void testPizzaMargheritaBean() {
        assertEquals("Pizza Margherita", pizza.getName());
        assertEquals(792, pizza.getCalories());
        assertEquals(4.99, pizza.getPrice());
    }
}