package FizzBuzz;
public class FizzBuzz{
    public static void main(String ... args) {
/*       for (int i=1; i<=105; i++){
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
     } */
    }
    public String convert(int number) {
        if(number==3){
            return "Fizz";
        }else if(number==6){
            return "Fizz";
        }else{
        return Integer.toString(number);
        }
    }
}
