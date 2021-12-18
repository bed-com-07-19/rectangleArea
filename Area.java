import javal.util.Scanner;
	 
class Area{
    private int length;
    private int width;
    public Area(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int returnArea(){
        return length * width;
    }
}

public class TryArea{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Area object = new Area();
        System.out.println("Enter length ");
        int length = input.nextInt();
        System.out.println("Enter width ");
        int width = input.nextInt();

        System.out.print("The area of the rectangle is " + object.Area(length, width));
    }
