public class newtech {

    int trigNades = 1;

    public void newTech() {

        System.out.println("Stella Montis trigger nade dupe");
        dupeTriggerNades(trigNades);
        System.out.println("Rubber ducks dupe, 5mil per raid");
    }

    public int dupeTriggerNades(int x) {
        trigNades = trigNades * 2;
        return trigNades;

    }

}
