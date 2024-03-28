
public class Calculator {
    private Memory memory=new Memory(); //objekt i klases Memory

    public double gjejShumen(double nr1, double nr2) {
        double rezultati = nr1 + nr2;
        memory.addToMemory(rezultati);
        return rezultati;
    }

    public double gjejDiferencen(double nr1, double nr2) {
        double rezultati = nr1 - nr2;
        memory.addToMemory(rezultati);
        return rezultati;
    }

    public double gjejProdhimin(double nr1, double nr2) {
        double rezultati = nr1 * nr2;
        memory.addToMemory(rezultati);
        return rezultati;
    }

    public double gjejHeresin(double nr1, double nr2) {

        if (nr2 == 0) {
            System.out.println("emeruesi duhet te jete i ndryshem nga 0");
            return 0.0;
        } else {
            double rezultati = nr1 / nr2;
            memory.addToMemory(rezultati);
            return rezultati;
        }
    }

    public double gjejRrenjen(double nr1) {

        if (nr1 < 0) {
            System.out.println("numri nuk este i vlefshem");
            return 0.0;
        } else {
            double rezultati = Math.sqrt(nr1);
            memory.addToMemory(rezultati);
            return rezultati;
        }


    }
    public double recallMemory(){return memory.recallMemory(); }

    public void clearMemory(){ memory.clearMemory();}
    public void addToMemory(double value){memory.addToMemory(value);}
}
