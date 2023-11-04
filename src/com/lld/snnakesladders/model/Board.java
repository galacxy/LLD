package com.lld.snnakesladders.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final int target;

    private final Map<Integer, BoardObject> objectMap;
    private final Map<Player, Integer> positions;

    public int move(Player p, int position){
        int newPosition = Math.min(target, position + positions.get(p));
        if (objectMap.containsKey(newPosition)){
            newPosition = objectMap.get(newPosition).getEnds()[1];
        }
        positions.put(p, newPosition);
        return newPosition;
    }

    public Board(int target, List<Player> players, List<BoardObject> objects){
        this.target = target;
        this.objectMap = new HashMap<>();
        objects.forEach(o -> objectMap.put(o.getEnds()[0], o));
        this.positions = new HashMap<>();
        players.forEach(p -> positions.put(p, 0));
    }

    public int getTarget() {
        return target;
    }
    public Map<Integer, BoardObject> getObjects() {
        return objectMap;
    }
    public Map<Player, Integer> getPositions() {
        return positions;
    }
}
