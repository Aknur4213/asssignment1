public class Cake {
    private String biscuit;
    private String frosting;
    private String filling;
    private String decorations;

    private Cake(Builder builder) {
        this.biscuit = builder.biscuit;
        this.frosting = builder.frosting;
        this.filling = builder.filling;
        this.decorations = builder.decorations;
    }

    public String getBiscuit() {
        return biscuit;
    }

    public String getFrosting() {
        return frosting;
    }

    public String getFilling() {
        return filling;
    }

    public String getDecorations() {
        return decorations;
    }

    public static class Builder {
        private String biscuit = "Классический";
        private String frosting = "Без крема";
        private String filling = "Без начинки";
        private String decorations = "Без декора";

        public Builder setBiscuit(String biscuit) {
            this.biscuit = biscuit;
            return this;
        }

        public Builder setFrosting(String frosting) {
            this.frosting = frosting;
            return this;
        }

        public Builder setFilling(String filling) {
            this.filling = filling;
            return this;
        }

        public Builder setDecorations(String decorations) {
            this.decorations = decorations;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }
}