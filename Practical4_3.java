public class Practical4_3 {


    public static void main(String[] args) {

        try {


            int a[] = new int[2];
            a[62]=62/0;


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }


        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }


        finally{
            System.out.println("Inside Finally");
        }
    }
}
