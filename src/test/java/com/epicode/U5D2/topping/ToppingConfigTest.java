package com.epicode.U5D2.topping;


import com.epicode.U5D2.entities.Topping;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ToppingConfigTest {

    @Autowired
    @Qualifier("toppings_cheese")
    private Topping toppingCheese;
    @Autowired
    @Qualifier("toppings_tomato")
    private Topping toppingTomato;
    @Autowired
    @Qualifier("toppings_pineapple")
    private Topping toppingPineapple;
    @Autowired
    @Qualifier("toppings_salami")
    private Topping toppingSalami;
    @Autowired
    @Qualifier("toppings_ham")
    private Topping toppingHam;

    @Test
    @DisplayName("Test toppings bean")
            public void testToppingsBean() {
    assertEquals("Tomato", toppingTomato.getName());
    assertEquals("Cheese", toppingCheese.getName());
            }

    @ParameterizedTest
    @CsvSource({
            "Cheese, 0.69",
            "Tomato, 0",
            "Pineapple, 0.79",
            "Salami, 0.99",
            "Ham, 0.99"
    })
    @DisplayName("Test toppings price within range")
    public void testToppingsPriceWithinRange(String name, double price) {

        if (price >= 0.60 && price <= 0.90) {
            assertTrue(price >= 0.60 && price <= 0.90, "Il prezzo deve essere tra 0.60 e 0.90.");
            System.out.println("Il prezzo di " + name + " è tra 0.60 e 0.90: " + price);
            System.out.println("------------------------");
        } else {
            System.out.println("Il prezzo di " + name + " non è tra 0.60 e 0.90: " + price);
            System.out.println("------------------------");
        }
    }
}
