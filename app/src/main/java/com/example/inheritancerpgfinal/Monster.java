package com.example.inheritancerpgfinal;

public class Monster extends Character {
    private String description, monsterName;
    private int monsterLevel;

    public Monster(int id, double baseHP, double baseMP, int monsterLevel, double pAtk, double mAtk, double pDef, double mDef,
                   String description, String monsterName) {

        super(id, baseHP, baseMP, pAtk, mAtk, pDef, mDef );

        this.description = description;
        this.monsterLevel = monsterLevel;
        this.monsterName = monsterName;

    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getMonsterLevel() {
        return monsterLevel;
    }

    public void setMonsterLevel(int monsterLevel) {
        this.monsterLevel = monsterLevel;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }
}
