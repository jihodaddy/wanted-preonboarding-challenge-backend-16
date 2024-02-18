package com.wanted.preonboarding.design.game;

public class Queen extends Character{
    @Override
    public void fight() {
        WeaponBehavior Axe = new AxeBehavior();
        setWeapon(Axe);
    }
}
