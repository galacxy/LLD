package com.lld.snnakesladders.service.impl;

import java.util.List;

import com.lld.snnakesladders.model.BoardObject;
import com.lld.snnakesladders.model.GameInstance;
import com.lld.snnakesladders.model.Player;
import com.lld.snnakesladders.service.SnakeLadderGameService;

public class SnakeLadderServiceImpl implements SnakeLadderGameService{
    private static SnakeLadderGameService snakeLadderGameService;

    private SnakeLadderServiceImpl(){
    }

    public static SnakeLadderGameService getInstance(){
        if (snakeLadderGameService == null){
            snakeLadderGameService = new SnakeLadderServiceImpl(); 
        }
        return snakeLadderGameService;
    }

    @Override
    public GameInstance initializeGame(List<Player> players, List<BoardObject> objects) {
        return new GameInstance(players, objects);
    }

    @Override
    public void play(GameInstance gameInstance) {
        gameInstance.play();
    }

    @Override
    public List<Player> getLeaderBoard(GameInstance gameInstance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLeaderBoard'");
    }

    @Override
    public Player getWinner(GameInstance gameInstance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWinner'");
    }

    @Override
    public void addPlayers(GameInstance gameInstance, List<Player> players) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPlayers'");
    }

    
    
}
