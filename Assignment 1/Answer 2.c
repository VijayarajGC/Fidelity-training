#include <stdio.h>

int main() 
{
    
     int pizzaPrice = 200;
     int puffPrice = 40;
     int coolDrinkPrice = 120;
     
    int pizzas = 5;
    int puffs = 6;
    int coolDrinks = 2;

    int totalPizzaCost = pizzas * pizzaPrice;
    int totalPuffCost = puffs * puffPrice;
    int totalCoolDrinkCost = coolDrinks * coolDrinkPrice;
    int grandTotal = totalPizzaCost + totalPuffCost + totalCoolDrinkCost;

    printf("Pizza  %d %d %d\n", pizzas, pizzaPrice, totalPizzaCost);
    printf("Puffs  %d %d %d\n", puffs, puffPrice, totalPuffCost);
    printf("Cool Drinks %d %d %d\n", coolDrinks, coolDrinkPrice, totalCoolDrinkCost);
    printf("Grand Total: Rs. %d\n", grandTotal);

    return 0;
}
