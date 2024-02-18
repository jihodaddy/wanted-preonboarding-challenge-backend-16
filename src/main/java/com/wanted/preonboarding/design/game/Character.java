package com.wanted.preonboarding.design.game;

public abstract class Character {
    private WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }
}
