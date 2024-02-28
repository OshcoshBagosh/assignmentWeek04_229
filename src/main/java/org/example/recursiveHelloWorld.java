public class recursiveHelloWorld {

    public static void main(String[] args) {
        sayHello(4);
    }

    public static void sayHello(int count){
        //Base Case
        if (count <= 0){
            return;
        }
        //Prints Hello world and uses the method again while incrementing count by 1.
        else {
            System.out.println("Hello World");
            sayHello(count - 1);
        }
    }


}
