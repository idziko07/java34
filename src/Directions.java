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



    public static Directions convert(int num){

        switch (num){
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return SOUTH;
            case 3:
                return WEST;
                default:
                    return UNDEFINED;
        }
    }


    @Override
    public String toString() {
        return "Ok idziemy na " + this.name;
    }
}
