public class BattleGame {

    static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("Battle Started!\n");

        for (GameCharacter character : characters) {
            character.performAttack(); 

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\nBattle Summary:");
        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    public static void main(String[] args) {
        GameCharacter[] characters = {
            new Warrior("Thor"),
            new Mage("Merlin"),
            new Archer("Robin"),
            new Warrior("Leon"),
            new Mage("Gandalf")
        };

        startBattle(characters);
    }
}