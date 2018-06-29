import java.util.Scanner;

public class Student {

    public String name;
    public int markMath;
    public int markEngl;
    public int markLitr;
    private double avgStud;


    private static Scanner sc=new Scanner(System.in);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getMarkMath(){
        return markMath;
    }

    public void setMarkMath(int markMath){
        this.markMath=markMath;
    }

    public int getMarkEngl(){
        return markEngl;
    }

    public void setMarkEngl(int markEngl){
        this.markEngl=markEngl;
    }

    public int getMarkLitr(){
        return markLitr;
    }

    public void setMarkLitr(int markLitr){
        this.markLitr=markLitr;
    }

    public double getAvgStud(){
        return avgStud;
    }

    private void setAvgStud(double avgStud){
        this.avgStud=avgStud;
    }

    public void nameInput(){
    System.out.println("Does the program work?");
        if (sc != null){
            String name=sc.nextLine();
        System.out.println("What is the name of the student??");}
        else { System.exit(0);}
        String name=sc.nextLine();
        this.setName(name);

    }

    public void markMath(){
        System.out.println("Mark for Math?");
        int mark=sc.nextInt();
        if (mark>0 && mark <=5){
            this.setMarkMath(mark);
        }
        else{
            System.out.println("Please enter a valid mark (from 1 to 5)!");
            markMath();

        }
    }

    public void markEngl(){
        System.out.println("Mark for English?");
        int mark=sc.nextInt();
        if (mark>0 && mark <=5){
            this.setMarkEngl(mark);
        }
        else{
            System.out.println("Please enter a valid mark (from 1 to 5)!");
            markEngl();

        }
    }

    public void markLitr(){
        System.out.println("Mark for Literatura?");
        int mark=sc.nextInt();
        if (mark>0 && mark <=5){
            this.setMarkLitr(mark);
        }
        else{
            System.out.println("Please enter a valid mark (from 1 to 5)!");
            markLitr();

        }
    }

    public boolean badStudent(){

        if( getMarkMath() == 2 || getMarkLitr() == 2 || getMarkEngl() == 2){
    return true;
        }
        else return false;

    }

    public boolean goodStudent(){
        if(getAvg() >4){
            return true;
        }
        else return false;
    }


    public double getAvg(){
        double avgStud=((double)getMarkEngl()+(double)getMarkLitr()+(double)getMarkMath())/3;
        this.setAvgStud(avgStud);
        return avgStud;
    }
    public void printStudentName(){
        System.out.println("---------------------------");
        System.out.println("Average mark of the " +getName() + " student " +"= "+ getAvg());
    }

}
