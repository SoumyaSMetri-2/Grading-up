package grading_up.pkg1;
import java.util.Scanner;
public class Grading_up1 {
    public static void Dolp(String ste){
        System.out.println(ste);
    }
    public static void main(String[] args) {
        int i,a ;
        float Tm=0,Perc;
        Dolp("Enter the number of subjects: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        Dolp("Enter the marks of "+ a + " Subjects");
        for(i=1;i<=a;i++){
            Tm += s.nextInt();
        }
        Perc = (Tm/a) ;
        Dolp("Total marks: "+ Tm +"Percentage: "+ Perc + "Grade is: ");
        switch((int) (Perc / 10 )) {
            case 9:
                Dolp(" S ");
                break;
            case 8:
                Dolp(" A ");
                break;
            case 7:
                Dolp(" B ");
                break;
            case 6:
                Dolp(" C ");
                break;
            case 5:
                Dolp(" D ");
                break;
            case 4:
                Dolp(" E ");
                break;
            default:
                Dolp(" FAIL ");
                break;
        }
    }
    
}
