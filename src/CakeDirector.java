public class CakeDirector {
    public Cake makeChocolateCake(Cake.Builder builder) {
        return builder
                .setBiscuit("Шоколадный")
                .setFrosting("Шоколадный ганаш")
                .setFilling("Вишня")
                .setDecorations("Шоколадная стружка")
                .build();
    }

    public Cake makeRedVelvetCake(Cake.Builder builder) {
        return builder
                .setBiscuit("Красный бархат")
                .setFrosting("Крем-чиз")
                .setFilling("Клубничное конфи")
                .setDecorations("Свежие ягоды")
                .build();
    }

    public Cake makeSimpleVanillaCake(Cake.Builder builder) {
        return builder
                .setBiscuit("Ванильный")
                .setFrosting("Сливочный")
                .setFilling("Сгущенка")
                .setDecorations("Без декора")
                .build();
    }
}