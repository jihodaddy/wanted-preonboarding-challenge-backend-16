package com.wanted.preonboarding.design.game;

public class King extends Character{
    @Override
    public void fight() {
        WeaponBehavior sword = new SwordBehavior();
        setWeapon(sword);
    }
}
