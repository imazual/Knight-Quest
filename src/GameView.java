import java.util.List;

public interface GameView {
    void splashScreen();
    void endGame();
    String displayMainMenu();
    void printHelp();
    void listKnights(List<Knight> activeKnights);
    void knightNotFound();
    void showKnight(Knight knight);
    void setActiveFailed();
    void printBattleText(List<MOB> monsters, List<Knight> activeKnights);
    void printBattleText(MOB dead);
    void printFortunes(List<Knight> activeKnights);
    boolean checkContinue();
    void printDefeated();

}
