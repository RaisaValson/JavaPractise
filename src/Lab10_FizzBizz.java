public class Lab10_FizzBizz {
    public static void main(String[] args) {
                for(int i=1;i<=100;i++){
                    if(i%3==0 && i%5==0){
                        System.out.println("FIZZBIZZ");
                    }
                    else if(i%3==0){
                        System.out.println("FIZZ");
                    }
                    else if(i%5==0){
                        System.out.println("BIZZ");
                    }
                    else {
                        System.out.println(i);
                    }
                }
    }
}
