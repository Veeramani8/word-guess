import java.util.Scanner;
public class guess_code {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a="tree";
        StringBuilder c= new StringBuilder(a.length());
        c.append("_".repeat(a.length()));
        for(int i=10;i>0;i--) {
            System.out.println("you have guess remaining: "+ i);
            for (int j = 0; j < a.length(); j++) {
                String b=ob.next();
                System.out.println("guess :" + b);
                if (a.contains(b)) {
                   int d= a.indexOf(b);
                    System.out.println(c.replace(d,d+1,b));
                }
                else {
                    System.out.println("wrong guess");
                    break;
                }
            }
            if(a.contentEquals(c)){
                System.out.println("you won");
                break;
            }

        }
    }
}
