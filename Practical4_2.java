class createdException extends Exception{
    public createdException(int t){
        System.out.println("Exception is Created");
    }
}

public class Practical4_2 {
    public static void main(String[] args) {
        try {
            throw new createdException(1);
        }
        catch (createdException e) {

        }
    }
}