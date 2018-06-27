public enum GenreType {
    THRILLER("Scary"),
    CHILDREN("Playful"),
    CRIME("Intriguing"),
    ROMANTIC("Love");

    private final String value;

    GenreType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
