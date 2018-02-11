public enum Directions {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód"),
    UNDEFINED("nieznany");

    private String name;
    Directions(String name) {
        this.name = name;
    }



    public static String convert(int num){

        switch (num){
            case 0:
                return NORTH.name();
            case 1:
                return EAST.name();
            case 2:
                return SOUTH.name();
            case 3:
                return WEST.name();
                default:
                    return UNDEFINED.name();
        }
    }


    @Override
    public String toString() {
        return "Ok idziemy na " + this.name;
    }
}
