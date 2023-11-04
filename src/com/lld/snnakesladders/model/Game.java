package com.lld.snnakesladders.model;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Game {
    private Queue<Player> players;
    private Board board;
    private List<Player> winners;
    private Dice dice;

    protected Game(List<Player> players, List<BoardObject> objects){
        this.players = new ArrayDeque<>(players);
        this.board = new Board(100, players, objects);
        this.dice = new Dice(6);
        this.winners = new LinkedList<>();
    }

    protected void play(){
        Player next = players.poll();
        int position = board.move(next, dice.rollDice());
        if (position == board.getTarget()){
            winners.add(next);
        } else {
            players.offer(next);
        }
    }
}
