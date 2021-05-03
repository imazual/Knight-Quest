import java.util.List;
import java.util.Scanner;

public class ConsoleView implements GameView{
    @Override
    public void splashScreen() {
        System.out.println("SPLASH SCREEN: TODO LATER");
    }

    @Override
    public void endGame() {
        System.out.println("END GAME: TODO LATER");
    }

    @Override
    public String displayMainMenu() {
        Scanner sc = new Scanner(System.in);

        String userResponse = sc.next();
        System.out.println("What would you like to do?");

        return userResponse;
    }

    @Override
    public void printHelp() {
        String.format("Unsure what to do, here are some options:" +
                "\tls or list all  - listing the knights\n" +
                "\tlist active  - list the active knights knights only\n" +
                "\tshow name or id - show the knight details card\n" +
                "\tset active name or id - set knight as active (note: only 4 knights can be active) \n" +
                "\tremove active name or id - remove a knight from active status (heals knight)\n" +
                "\texplore or adventure or quest - find random monsters to fight\n" +
                "\tsave filename - save the game to the file name (default: saveData.csv)\n" +
                "\texit or goodbye - to leave the game\n" +
                "Game rules: You can have four active knights. As long as they are active, they won't heal,\n" +
                "but they can gain XP by going on adventures.\n" +
                "When you make a knight inactive, they will heal. How many monsters can you defeat \n" +
                "before, you have to heal?");
    }

    @Override
    public void listKnights(List<Knight> activeKnights) {

    }

    @Override
    public void knightNotFound() {
        System.out.println("\tKnight not found!");
    }

    @Override
    public void showKnight(Knight knight) {

    }

    @Override
    public void setActiveFailed() {

    }

    @Override
    public void printBattleText(List<MOB> monsters, List<Knight> activeKnights) {

    }

    @Override
    public void printBattleText(MOB dead) {

    }

    @Override
    public void printFortunes(List<Knight> activeKnights) {

    }

    @Override
    public boolean checkContinue() {
        return false;
    }

    @Override
    public void printDefeated() {

    }

}
