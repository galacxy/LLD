package com.lld.snnakesladders;

import java.util.Arrays;
import java.util.List;

import com.lld.snnakesladders.model.BoardEntityType;
import com.lld.snnakesladders.model.BoardObject;
import com.lld.snnakesladders.model.GameInstance;
import com.lld.snnakesladders.model.Player;
import com.lld.snnakesladders.service.SnakeLadderGameService;
import com.lld.snnakesladders.service.impl.SnakeLadderServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Player> players = Arrays.asList(new Player(1, "Amit"), new Player(2, "Rohit"));
        List<BoardObject> objects = Arrays.asList(
            new BoardObject(1, 56, BoardEntityType.LADDER), 
            new BoardObject(99, 2, BoardEntityType.SNAKE));
        SnakeLadderGameService service = SnakeLadderServiceImpl.getInstance();
        GameInstance instance = service.initializeGame(players, objects);
        service.play(instance);
        service.play(instance);
    }
}
