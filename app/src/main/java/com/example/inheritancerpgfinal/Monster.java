package com.example.inheritancerpgfinal;

public class Monster extends Character {
    private String description;

    public Monster(int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef, String description) {

        super(id, baseHP, baseMP, pAtk, mAtk, pDef, mDef);
        this.description = description;

    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
