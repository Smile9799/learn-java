import java.util.Scanner;

public class ProblemALG005b {
    public static void printDiamond(int sizeOfShape,  int xCentre, int yCentre){
        for(int i =0;i<25;i++) {
            for(int j=0;j<79;j++) {
                if(i>=3 && i<=14 ) {
                    if(xCentre==j || yCentre==j)
                        System.out.print("$");
                }
                if(j%10==0) {
                    System.out.print(j/10);
                }
                System.out.print("=");
            }
            System.out.println("");
            if(sizeOfShape>=3 && sizeOfShape<=14) {
                if(yCentre<=25 && xCentre>=35) {
                    int temp=xCentre;
                    xCentre=yCentre;
                    yCentre=temp;
                }
                else{
                    yCentre--;
                    xCentre++;
                }
            }
        }
    }

    public static void main(String[] args) {

        printDiamond(6,4,9);
    }
}
