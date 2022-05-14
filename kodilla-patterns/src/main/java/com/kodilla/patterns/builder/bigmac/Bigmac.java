package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final String sauce;
    private final Integer burgers;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {

        private String bun;
        private String sauce;
        private Integer burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun,sauce, burgers, ingredients);
        }
    }

    public Bigmac(String bun, String sauce, Integer burgers, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
