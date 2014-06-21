package com.windrift.com.windrift.designpattern.builder;


/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 15/05/12
 * Time: 10:29 AM
 * This shows how the builder pattern works
 * <p>
 * Tthe Builder pattern is a good choice when designing classes
 * whose constructors or static factories would have more than a handful of
 * parameters, especially
 * </p>
 * The client will instantiate the object by
 *  NutritionFacts nutritionFacts = new NutritionFacts.Builder(5, 8).fat(6).sodium(7).build();
 */
public  class BuilderPattern {
    public static void main (String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(5, 8).fat(6).sodium(7).build();
    }
}

class NutritionFacts {
    //Required attributes
    private final int servingSize;
    private final int servings;
    //Optional attributes
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder (int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories (int val) {
            this.calories = val;
            return this;
        }
        public Builder fat (int val) {
            this.fat = val;
            return this;
        }
        public Builder carbohydrate (int val) {
            this.carbohydrate = val;
            return this;
        }
        public Builder sodium (int val) {
            this.sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        calories = builder.calories;
        carbohydrate = builder.carbohydrate;
        fat = builder.fat;
        servings = builder.servings;
        servingSize = builder.servingSize;
        sodium = builder.sodium;
    }

}
