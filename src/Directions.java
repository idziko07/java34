public enum Directions {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód");

    private String name;
    Directions(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ok idziemy na " + this.name;
    }
}
