public class Main {
    public static void main(String[] args) {
        CakeDirector director = new CakeDirector();

        Cake chocolateCake = director.makeChocolateCake(new Cake.Builder());

        System.out.println(chocolateCake.getBiscuit() + " " +
                chocolateCake.getFrosting() + " " +
                chocolateCake.getFilling() + " " +
                chocolateCake.getDecorations());

        Cake redVelvet = director.makeRedVelvetCake(new Cake.Builder());

        System.out.println(redVelvet.getBiscuit() + " " +
                redVelvet.getFrosting() + " " +
                redVelvet.getFilling() + " " +
                redVelvet.getDecorations());

        Cake customCake = new Cake.Builder()
                .setBiscuit("Морковный")
                .setFrosting("Сметанный крем")
                .setFilling("Грецкие орехи")
                .setDecorations("Карамельные фигурки")
                .build();

        System.out.println(customCake.getBiscuit() + " " +
                customCake.getFrosting() + " " +
                customCake.getFilling() + " " +
                customCake.getDecorations());
    }
}