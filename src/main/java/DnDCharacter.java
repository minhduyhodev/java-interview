import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final Random random = new Random();
    private int strength; // (Lưu ý sửa chính tả chữ strenght thành strength)
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int constitution;
    private int hitPoints;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitPoints = getHitpoints();
    }

    int ability(List<Integer> scores) {

        List<Integer> copy = new ArrayList<>(scores);
        int sum = 0;
        int lowest = 7;
        int index = -1;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) < lowest) {
                lowest = copy.get(i);
                index = i;
            }
        }
        copy.remove(index);
        for (int i = 0; i < copy.size(); i++) {
            sum += copy.get(i);
        }
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            res.add(random.nextInt(6) + 1);
        }
        return res;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

}
