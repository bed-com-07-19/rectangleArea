import javal.util.Scanner;
	 
class Area1{
    private int length;
    private int width;
    public Area1(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int returnArea(){
        return length * width;
    }
}

public class Area{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = input.nextInt();
        System.out.println("Enter width ");
        int width = input.nextInt();
	Area1 object = new Area1(length, width);

        System.out.print("The area of the rectangle is " + object.returnArea());
    }
}
