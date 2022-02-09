package com.upgrad.assignment;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    LocalTime openingTime = LocalTime.parse("10:30:00");
    LocalTime closingTime = LocalTime.parse("22:00:00");

    Restaurant restaurant=new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);

    Item item1;
    Item item2;

    @Test
    public void calculate_and_return_correct_total_price_for_items_in_the_menu() {
        item1 = restaurant.addToMenu("Sweet corn soup",119);
        item2 = restaurant.addToMenu("Vegetable lasagne", 269);

        assertEquals(item1.getPrice()+item2.getPrice(), restaurant.findTotalPrice());
    }

    @Test
    public void calculate_and_return_zero_price_amount_when_no_items_in_the_menu() {
        int amount = 0;
        assertEquals(amount, restaurant.findTotalPrice());
    }
}
