public class Main {

    public static void main (String[] args){

        Boss boss=new Boss();
        boss.setDamage(50);
        boss.setName("Boss");
        boss.setHealth(600);
        boss.weapon.setName("SwordOfHell");
        boss.weapon.setWeaponType(WeaponType.SWORD);
        System.out.println(boss.printInfo());


    }

}