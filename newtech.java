import java.net.Socket;
import java.util.Scanner;

public class newtech {

    int trigNades = 2;
    int rubberDucks = 2;

    public void newTech() {

        System.out.println("Stella Montis trigger nade dupe");
        dupeTriggerNades(trigNades);
        System.out.println("Rubber ducks dupe, 5mil per raid");
        dupeRubberDucks(rubberDucks);
    }

    public int dupeTriggerNades(int x) {
        trigNades = trigNades + 1;
        return trigNades;

    }

    public int dupeRubberDucks(int x) {
        rubberDucks = rubberDucks + 1;
        return rubberDucks;

    }

    public void emotes() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Emote wheel: ");
            System.out.println("1. Hello Raider!");
            System.out.println("2. Come here Raider!");
            System.out.println("3. Dont shoot!");
            int choice = scan.nextInt();

            if(choice > 0 && choice < 3) {
                if(choice == 1) {
                    System.out.println("Hello Raider!");
                } else if (choice == 2) {
                    System.out.println("Come here raider!");
                } else {
                    System.out.println("Dont shoot!ttt");
                }

                break;
            } 

        }
       
    }

}
