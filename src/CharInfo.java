/**
 * Created by VeryBarry on 9/12/16.
 * Basic Character Info
 */
public class CharInfo {
    String name;
    String profession;
    int level;
    Boolean alliance;
    Boolean horde;
    int kills;
    int deaths;

    String[] skills = new String[3];

    CharInfo(String name, String profession, int level, int kills, int deaths, String skills){
        setName(name);
        setProf(profession);
        setLvl(level);
        setKills(kills);
        setDeaths(deaths);
    }

    void setName(String charName) {
        String newName = name;
    }

    String getName() {
        return name;
    }

    void setProf(String charProf) {
        String newProf = profession;
    }

    String getProf() {
        return profession;
    }

    void setLvl(int charLvl) {
        int newLvl = level;
    }

    int getLvl() {
        return level;
    }

    void setKills(int charKills) {
        int newKills = kills;
    }

    int getKills() {
        return kills;
    }

    void setDeaths(int charDeaths) {
        int newDeaths = deaths;
    }

    int getDeaths() {
        return deaths;
    }

    void maxLvl(int newLevel) {
        if (level <= 110){
            setLvl(level);
        }
        else{
            System.out.println("Not a valid level, try again.");
        }

    }
}
