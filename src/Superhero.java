public class Superhero {
    private String name;
    private String superHeroName;
    private String superPower;
    private int creationYear;
    private int strength;

    //contructor 1
    public Superhero (String name, String superHeroName, String superPower, int creationYear, int strength){
        this.name = name;
        this.superHeroName = superHeroName;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }
    //constructor 2
    public Superhero (String name, String superPower,int creationYear, int strength) {
        this.name = name;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    //getter
    public String getName() {
        return name;
    }
    public String getSuperHeroName() {
        return superHeroName;
    }
    public String getSuperPower() {
        return superPower;
    }
    public int getCreationYear() {
        return creationYear;
    }
    public int getStrength() {
        return strength;
    }

    //setters


    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Superhelt:" + "\n" +
                "Navn:" + " " + name + "\n" +
                "Superheltenavn:" + " " + superHeroName + "\n" +
                "Superkræft:" + " " + superPower + "\n" +
                "skabelsesår:" + " " + creationYear + "\n" +
                "Styrke:" + " " + strength + "\n";
    }
}

    /* Skal fremvise en menu (kodes i main, da det er userinterface)
    hvor det er muligt at oprette en superhelt, øge blandt superhselte, ændre i stats
    slette superhelte. Der må ikke komme "computersprog" til brugeren, f.eks. true/false
    Programmet må ikke crashe, men skal rette brugeren, f.eks. via try-catch metoder.
    Databasen (arraylist) skal være dynamic sizing, og ikke fixed limit.
    Der skal kunne vises en komplet liste over superhelte.
    Der skal kunne søges vha. hele navne, bogstaver osv. så "s" f.eks. viser spiderman
    og superman. Der skal kunne vælges blandt søgeresultaterne.
    Single Resposible priciple

     */

