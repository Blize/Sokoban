package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class BoardSokoban {
    private Tile [][] tileMatrix = null;
    private String path = "";


    public BoardSokoban(String path) {
        this.path=path;
    }

    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path=path;
    }

    public Tile[][] getTile() {
        return tileMatrix;
    }

    @Override
    public String toString() {
        String buffer = "";
        for (Tile[] tileRow: tileMatrix) {
            for (Tile tile: tileRow) {
                buffer += tile.getType();
            }
            buffer += "\n";
        }
        return buffer;
    }

    /**
     * This method reads a file and then reads length and width
     * @throws IOException
     */
    public void readFile() throws IOException {
        File file = new File(path);
        List<String> lines = Files.readAllLines(file.toPath());



        int x = 0;
        int y = 0;

        int lineLengthHeight = lines.size();
        int lineLengthWidth = lines.get(0).length();

        tileMatrix = new Tile[lineLengthHeight][lineLengthWidth];

        for (String line: lines) {
            char [] chars = line.toCharArray();

            x = 0;
            for(char type: chars) {
                tileMatrix[y][x] = new Tile(x, y, type);
                x++;
            }
            y++;
        }

    }
    public int getHeightOfArray() {
        return tileMatrix.length;
    }
    public int getWidthOfArray() {
        return tileMatrix[0].length;
    }
}
