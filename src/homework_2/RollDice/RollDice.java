package homework_2.RollDice;

//pakotnes nosaukumus rakstami tikai ar mazajiem burtiem
//komentarus koda nedrikst atstat - dzest
public class RollDice {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        System.out.println("pirmais kauliņs: " + dice1 + " otrais kauliņs: " + dice2 + " summa: " + (dice1 + dice2));
    }
}
