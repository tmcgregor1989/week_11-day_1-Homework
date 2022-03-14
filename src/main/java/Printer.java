import javax.print.attribute.standard.Copies;

public class Printer {

    private int paper;
    private int toner;


    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;

    }

    public int countPaper(){
        return this.paper;
    }

    public int checkToner(){
        return this.toner;
    }

    public String print(int pages, int copies){
        if(this.paper >= pages * copies){
            this.paper -= pages * copies;
            this.toner -= 1;
            return "Printed up nicely";
        }else{
            return "Insufficient paper";}
        }
}
