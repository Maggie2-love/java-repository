public class HouseAsciiArt {
    public static void main(String[] args) {

        char[][] drawing = new char[15][30];

        // Fill the array with spaces
        for (int row = 0; row < drawing.length; row++) {
            for (int column = 0; column < drawing[row].length; column++) {
                drawing[row][column] = ' ';
            }
        }

        // Roof
        drawing[1][14] = '*';

        drawing[2][13] = '*';
        drawing[2][14] = '*';
        drawing[2][15] = '*';

        drawing[3][12] = '*';
        drawing[3][13] = '*';
        drawing[3][14] = '*';
        drawing[3][15] = '*';
        drawing[3][16] = '*';

        drawing[4][11] = '*';
        drawing[4][12] = '*';
        drawing[4][13] = '*';
        drawing[4][14] = '*';
        drawing[4][15] = '*';
        drawing[4][16] = '*';
        drawing[4][17] = '*';

        // Walls
        for (int row = 5; row <= 11; row++) {
            drawing[row][11] = '#';
            drawing[row][17] = '#';
        }

        // Bottom of house
        for (int column = 11; column <= 17; column++) {
            drawing[11][column] = '#';
        }

        // Windows
        drawing[7][12] = '@';
        drawing[7][16] = '@';

        // Door
        drawing[9][14] = '+';
        drawing[10][14] = '+';
        drawing[11][14] = '+';

        // Display the drawing
        for (int row = 0; row < drawing.length; row++) {
            for (int column = 0; column < drawing[row].length; column++) {
                System.out.print(drawing[row][column]);
            }

            System.out.println();
        }
    }
}
