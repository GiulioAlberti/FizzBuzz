package FizzBuzz;
public class Main {
    public static void main(String ... args){
        for (int i=1; i<=105; i++){
            String res="";
            if(i%3==0){
                res+="Fizz";
            }
            if (i%5==0){
                res+="Buzz";
            }
            if (i%7==0){
                res+="Bang";
            }
            System.out.println(res.isEmpty()? i: res);
        }
    }
}
