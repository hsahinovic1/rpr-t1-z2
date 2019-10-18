import java.util.Scanner;
public class Main {
public static int sumaCifara(int n){
    int suma=0;
    while(n!=0){
        suma+=n%10;
        n=n/10;
    }
    return suma;
}
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n= input.nextInt();
    for(int i=1; i<n;i++){
        if(i%sumaCifara(i)==0){
        System.out.println(i);}}
    }
}
