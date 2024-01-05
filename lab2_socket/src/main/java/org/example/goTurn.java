package org.example;

import java.io.Serializable;

public class goTurn implements Serializable {
    public int x;
    public int y;
    public int z;
    public int d;

    public goTurn(int x, int y, int z, int d) {
        this.x = x - 1;
        this.y = y - 1;
        this.z = z - 1;
        this.d = d - 1;
    }
}
