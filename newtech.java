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

}
