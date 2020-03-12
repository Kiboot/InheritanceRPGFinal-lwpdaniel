package com.example.inheritancerpgfinal;

public class Hero extends Character {
    private int heroID;
    private int heroLevel;
    private String heroClass;
    private double heroXP;
    private double baseSTR, baseAGI, baseINT;
    private double strGrowth, agiGrowth, intGrowth;

    public Hero (int id, double baseHP, double baseMP, double pAtk, double pDef, double mAtk, double mDef,
                 String heroClass, double heroXP, double baseSTR, double baseAGI, double baseINT,
                 int heroLevel, double strGrowth, double agiGrowth, double intGrowth) {

        super(id, baseHP, baseMP, pAtk, pDef, mAtk, mDef);
        //super - calling other class to this class and this class will become subclass and the one you call become superclass.

        this.heroClass = heroClass;
        this.heroXP = heroXP;
        this.baseSTR = baseSTR;
        this.baseAGI = baseAGI;
        this.baseINT = baseINT;
        this.heroLevel = heroLevel;
        this.strGrowth = strGrowth;
        this.agiGrowth = agiGrowth;
        this.intGrowth = intGrowth;

    }


    //Imported Setters and Getters has a (super.set/get) in the code

    //Imported Setters - from Characters setters

    public void setBaseHP(double baseHP) {
        super.setBaseHP(baseHP);
    }
    public void setBaseMP(double baseMP) {
        super.setBaseMP(baseMP);
    }
    public void setPAtk(double pAtk) {
        super.setPAtk(pAtk);
    }
    public void setMAtk(double mAtk) {
        super.setMAtk(mAtk);
    }
    public void setPDef(double pDef) {
        super.setPDef(pDef);
    }
    public void setMDef(double mDef) {
        super.setMDef(mDef);
    }

    //Imported Getters - from Characters getter

    public double getBaseHP() {
        return super.getBaseHP();
    }
    public double getBaseMP() {
        return super.getBaseMP();
    }
    public double getPAtk() {
        return super.getPAtk();
    }
    public double getMAtk() {
        return super.getMAtk();
    }
    public double getPDef() {
        return super.getPDef();
    }
    public double getMDef() {
        return super.getMDef();
    }

    //Local Setters - this class setters


    public void setBaseAGI(double baseAGI) {
        this.baseAGI = baseAGI;
    }
    public void setBaseINT(double baseINT) {
        this.baseINT = baseINT;
    }
    public void setBaseSTR(double baseSTR) {
        this.baseSTR = baseSTR;
    }
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
    public void setHeroXP(double heroXP) {
        this.heroXP = heroXP;
    }
    public void setHeroLevel(int heroLevel) {
        this.heroLevel = heroLevel;
    }
    public void setStrGrowth(double strGrowth) {
        this.strGrowth = strGrowth;
    }
    public void setAgiGrowth(double agiGrowth) {
        this.agiGrowth = agiGrowth;
    }
    public void setIntGrowth(double intGrowth) {
        this.intGrowth = intGrowth;
    }

    //Local Getters - this class getters

    public double getBaseAGI() {
        return baseAGI;
    }
    public double getBaseINT() {
        return baseINT;
    }
    public double getBaseSTR() {
        return baseSTR;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public double getHeroXP() {
        return heroXP;
    }
    public int getHeroLevel() {
        return heroLevel;
    }
    public double getStrGrowth() {
        return strGrowth;
    }
    public double getAgiGrowth() {
        return agiGrowth;
    }
    public double getIntGrowth() {
        return intGrowth;
    }

    //Compute Health and Mana with Stats

    public double baseHPwSTR() {
        return super.getBaseHP() + (20*strGrowthwLvl());
    }
    public double baseMPwINT() {
        return super.getBaseMP() + (12*intGrowthwLvl());
    }

    //Compute Strength, Agility, and Intelligence with Levels

    public  double strGrowthwLvl () {
        return baseSTR + (strGrowth*heroLevel);
    }
    public  double intGrowthwLvl () {
        return baseINT + (intGrowth*heroLevel);
    }
    public  double agiGrowthwLvl () {
        return baseAGI + (agiGrowth*heroLevel);
    }

    //Compute Attributes with stats

    public double pAtkGrowth () {
        return super.getPAtk() + ((0.2*agiGrowth));

    }
    public double pDefGrowth() {
        return super.getPDef() + (0.1*strGrowthwLvl());
    }
    public double mDefGrowth() {
        return super.getMDef() + ((0.2*strGrowthwLvl()));
    }
    public double mAtkGrowth() {
        return super.getMAtk() + (0.3*intGrowthwLvl());
    }
    public double evaGrowth() {
        return 0.0004*(agiGrowth);
    }

}
