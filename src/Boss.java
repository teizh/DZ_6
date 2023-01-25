public class Boss extends GameEntity {

    Weapon weapon = new Weapon();

    public String printInfo() {
    return "Boss Health: "+ getHealth()+"; Boss Demage: "+getDamage()+ "; Boss weapon: "
            + weapon.getName()+ "; Weapon type: "+ weapon.getWeaponType();
    }

}
