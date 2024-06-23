package com.project.Diet;

public class FoodDTO {

    private String id;
    private String 식품명;
    private float 에너지;
    private float 단백질;
    private float 지방;
    private float 탄수화물;

    public FoodDTO(String id, String 식품명, float 에너지, float 단백질, float 지방, float 탄수화물) {
        this.id = id;
        this.식품명 = 식품명;
        this.에너지 = 에너지;
        this.단백질 = 단백질;
        this.지방 = 지방;
        this.탄수화물 = 탄수화물;
    }

    public String getId() {
        return id;
    }

    public String get식품명() {
        return 식품명;
    }

    public float get에너지() {
        return 에너지;
    }

    public float get단백질() {
        return 단백질;
    }

    public float get지방() {
        return 지방;
    }

    public float get탄수화물() {
        return 탄수화물;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void set식품명(String 식품명) {
        this.식품명 = 식품명;
    }

    public void set에너지(float 에너지) {
        this.에너지 = 에너지;
    }

    public void set단백질(float 단백질) {
        this.단백질 = 단백질;
    }

    public void set지방(float 지방) {
        this.지방 = 지방;
    }

    public void set탄수화물(float 탄수화물) {
        this.탄수화물 = 탄수화물;
    }
}