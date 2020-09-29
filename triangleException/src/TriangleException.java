import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sidea = 0, sideb=0, sidec=0;
        try{
            System.out.println("Enter side a");
            sidea = sc.nextInt();
            System.out.println("Enter side b");
            sideb = sc.nextInt();
            System.out.println("Enter side c");
            sidec = sc.nextInt();
            if(sidea+sideb<sidec || sidea+sidec<sideb || sideb+sideb<sidea){
                throw new IllegalTriangleException("dsd");
            }
        } catch (Exception e){
            System.out.println("k phai tam giac");
            e.printStackTrace();
        }



    }
}
