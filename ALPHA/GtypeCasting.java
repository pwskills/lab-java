package ALPHA;
public class GtypeCasting {
    public static void main(String[] args){
        int marks =(int)(99.9999f);  // import data is loss (.9999 is loss )
        int b = (int)marks;
        System.out.println(b);
    }
}
