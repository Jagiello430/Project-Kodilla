package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final Enum bun;
    private final Enum burgers;
    private final Enum sauce;
    private final List<Enum> ingredients;

    public static class BigmacBuilder {
        private Enum bun;
        private Enum burgers;
        private Enum sauce;
        private List<Enum> ingredients = new ArrayList<>();

        public BigmacBuilder(Enum bun, Enum burgers) {
            this.bun = bun;
            this.burgers = burgers;
        }

        public BigmacBuilder sauce(Enum sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Enum ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

        private Bigmac(Enum bun, Enum burgers, Enum sauce, List<Enum> ingredients) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = ingredients;
        }

    public Enum getBun() {
        return bun;
    }

    public Enum getBurgers() {
        return burgers;
    }

    public Enum getSauce() {
        return sauce;
    }

    public List<Enum> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
