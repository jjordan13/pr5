package com.example.pr5;
public class State {
    private String name, capital; private int flagResource;
    public State(String name, String capital, int flag) { this.name=name; this.capital=capital; this.flagResource=flag; }
    public String getName() { return name; }
    public String getCapital() { return capital; }
    public int getFlagResource() { return flagResource; }
}