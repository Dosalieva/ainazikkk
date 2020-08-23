package com.company;

public class Main {

    public static void main(String[] args) {
       Boss boss = new Boss();

       boss.setHealth(300);
        System.out.println("Здоровье босса: " + boss.getHealth());

        boss.setDamage(30);
        System.out.println("Урон босса: " + boss.getDamage());

        boss.setDifferenceType("Телепортация");
        System.out.println("Тип защиты босса: " + boss.getDifferenceType());

        boss.setSuperPower("Летать");
        System.out.println("Суперспособность босса: "+ boss.getSuperPower());

        Weapon weapon = new Weapon();

        weapon.setWeaponName("ДП-28");
        System.out.println("Имя оружия: "+ weapon.getWeaponName());

        weapon.setWeaponType("Легкий пулемёт");
        System.out.println("Тип оружия: "+ weapon.getWeaponType());

        boss.setWeapon(weapon);
        System.out.println(boss.getHealth()+" "+ boss.getDamage()+ " " + boss.getDifferenceType()+" " + boss.getSuperPower()+" " +
                "Информация об оружии"+" " + boss.getWeapon().getWeaponType()+" " + boss.getWeapon().getWeaponName());
    }
}
