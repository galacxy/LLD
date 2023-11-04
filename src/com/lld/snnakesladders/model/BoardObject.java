package com.lld.snnakesladders.model;

public class BoardObject {
    private final BoardEntityType type;
    private final int[] ends;
    public int[] getEnds() {
        return ends;
    }
    public BoardObject(int i, int j, BoardEntityType type){
        this.type = type;
        this.ends = new int[]{i,j};
    }
}
