import java.util.Scanner;
public class add1b {
    public static void main(String args[]) {
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter the four digit number ");
        int p = dis.nextInt();
        int n = p;
        int digit[] = new int[4];
        for(int i=0;i<4;i++) {
            digit[i] = p%10;
            p = p/10;
        }
        int q = 0;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                for(int k=0; k<4; k++) {
                    for(int l=0; l<4; l++) {
                        System.out.println(digit[i]+""+digit[j]+""+digit[k]+""+digit[l]);
                        q++;
                    }
                }
            }

        }
        System.out.println("Total no. of numbers = "+q);
        

        }
    }

    

