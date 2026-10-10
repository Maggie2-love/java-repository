public class House {
    public static void main(String[] args) {

        String[][] house = {
            {"   /\\   "},
            {"  /  \\  "},
            {" /____\\ "},
            {" |    | "},
            {" | [] | "},
            {" |____| "}
        };

        for (int row = 0; row < house.length; row++) {
            System.out.println(house[row][0]);
        }
    }
}
