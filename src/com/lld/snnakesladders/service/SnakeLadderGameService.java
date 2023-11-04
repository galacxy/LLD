package com.lld.snnakesladders.service;

import java.util.List;

import com.lld.snnakesladders.model.BoardObject;
import com.lld.snnakesladders.model.GameInstance;
import com.lld.snnakesladders.model.Player;

public interface SnakeLadderGameService {
    GameInstance initializeGame(List<Player> players, List<BoardObject> objects);
    void play(GameInstance gameInstance);
    List<Player> getLeaderBoard(GameInstance gameInstance);
    Player getWinner(GameInstance gameInstance);
    void addPlayers(GameInstance gameInstance, List<Player> players);
}
