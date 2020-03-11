package com.example.inheritancerpgfinal;

public class Character {
    private int id;
    private double baseHP, baseMP, pAtk, mAtk, pDef, mDef;
    private boolean isAttackable = true;

    //m = Magic
    //p = Physical

    public Character(int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef, boolean isAttackable) {
        this.id = id;
        this.baseHP = baseHP;
        this.baseMP = baseMP;
        this.pAtk = pAtk;
        this.mAtk = mAtk;
        this.pDef = pDef;
        this.mDef = mDef;
        this.isAttackable = isAttackable;
    }
    public Character(int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef) {
        this.id = id;
        this.baseHP = baseHP;
        this.baseMP = baseMP;
        this.pAtk = pAtk;
        this.mAtk = mAtk;
        this.pDef = pDef;
        this.mDef = mDef;
    }

    //Setters

    public void setId (int id) {
        this.id = id;
    }
    public void setBaseHP (double baseHP) {
        this.baseHP = baseHP;
    }
    public void setBaseMP (double baseMP) {
        this.baseMP = baseMP;
    }
    public void setPAtk (double pAtk) {
        this.pAtk = pAtk;
    }
    public void setMAtk (double mAtk) {
        this.mAtk = mAtk;
    }
    public void setPDef (double pDef) {
        this.pDef = pDef;
    }
    public void setMDef (double mDef) {
        this.mDef = mDef;
    }
    public void setAttackable(boolean attackable) {
        isAttackable = attackable;
    }

    //Getters

    public int getId () {
        return this.id;
    }
    public double getBaseHP () {
        return this.baseHP;
    }
    public double getBaseMP () {
        return this.baseMP;
    }
    public double getPAtk () {
        return this.pAtk;
    }
    public double getMAtk () {
        return this.mAtk;
    }
    public double getPDef () {
        return this.pDef;
    }
    public double getMDef () {
        return this.mDef;
    }
    public boolean getAttackable() {
        return isAttackable;
    }

}
