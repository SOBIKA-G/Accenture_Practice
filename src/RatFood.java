import java.util.Scanner;
public class RatFood {
    public static void main(String[] args) {
        System.out.print("Enter the number of rats : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print("Enter the units of food required : ");
        int u = sc.nextInt();
        System.out.println("Enter the number of houses : ");
        int n = sc.nextInt();
        int[] houses = new int[n];
        for(int i = 0;i<n;i++){
            houses[i] = sc.nextInt();
        }
        int totFood = r*u;
        int foodTill = 0;
        int house = 0;
        for(house = 0;house<n;house++){
            foodTill += houses[house];
            if(foodTill>=totFood){
                break;
            }
        }
        if(foodTill<totFood){
            System.out.println("Food insufficient");
        }
        else{
            System.out.println("food enough till "+(house+1)+" houses.");
        }

    }
}
