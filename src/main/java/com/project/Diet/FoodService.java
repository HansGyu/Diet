package com.project.Diet;

import java.util.List;

public interface FoodService {
    List<Food> getAllFoods();
    Food saveFood(Food food);
}
