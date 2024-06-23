package com.project.Diet;

import java.util.List;

public interface FoodDAO {
    List<FoodDTO> getAllFoods();
    FoodDTO saveFood(FoodDTO foodDTO);
}