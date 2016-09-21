public class ghp3_1{

    public static void main(String[] args) {
    char Ch ;
        int i = 1;
        double EPS = 1e-14;
        for (Ch = '!'; Ch <'~'; Ch++){
            System.out.print(Ch);
            System.out.print(" ");
            if (i%10<EPS){
                System.out.println();
            }
            i++;
        }
    }
}

