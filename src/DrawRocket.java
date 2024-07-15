/**
 * Created by YOUR_NAME on DATE
 * You shouldn't use any if-else statements
 * Put comments in your code
 * Discussed with: XXX
 **/
public class DrawRocket {
    // The variable shown below would normally be a class constant,
    // but we're using a variable in support of automated testing of
    // how well your code scales. You should not change the name of the variable!
    public static Integer size = 3; // DO NOT REMOVE THIS LINE - You may change the VALUE of size for testing purposes
    public  static int i;
    public static int j;
    public static void main(String[] args) {
        //Remove this comment and below line and implement your code
        cone(size);
        transition();
        base1();
        base11();
        transition();
        base11();
        base1();
        cone(size);

    }

    public static void cone(Integer size){
        int space = size + 2;
        int l = 1;

        for (i = space; i > 0; i--) {

            for (j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < l; k++) {
                System.out.print("/");
            }
            System.out.print("*++*");
            for (int k = 0; k < l; k++) {
                System.out.print("\\");
            }
            System.out.println();
            l++;

        }
    }
    public static void transition(){

        System.out.print("**");
        for (int i = 0; i < size; i++){
            System.out.print("=+=+");
        }
        System.out.println("**");
    }

    public static void base1(){
        int k;
        int l = 0;

        for ( i = size; i > 0; i--){


            System.out.print("||");
            for (k = 0; k < 2; k++){
            for (int o = 0; o < l; o++) {
                System.out.print("*");
            }

                for ( j = i; j > 0; j--){
                    System.out.print("\\/");

                }

                    for (int q = 0; q < l; q++) {
                        System.out.print("*");
                    }

            }
            System.out.println("||");
            l++;
        }




    }

    public static void base11(){
        int k;
        int l = size;
        int dot = size - 1;
        int pyr = 1;



        for ( i = 0; i < size; i++){



            System.out.print("||");
            for (k = 2; k > 0; k--){

                for (int o = 1 ; o <= dot; o++) {
                    System.out.print("*");
                }

                for ( j = 1; j <= pyr; j++){
                    System.out.print("/\\");

                }

                for(int g = 1 ; g <= dot; g++) {
                    System.out.print("*");
                }


            }
            System.out.println("||");
            dot --;
            pyr ++;
        }




    }
}

     /* ||\/\/\/\/\/\/||
        ||.\/\/..\/\/.||
        ||..\/....\/..||
        ||../\..../\..||
        ||./\/\../\/\.||
        ||/\/\/\/\/\/\||

        ||../\..../\..||
        ||./\/\../\/\.||
        ||/\/\/\/\/\/\||
        ||\/\/\/\/\/\/||
        ||.\/\/..\/\/.||
        ||..\/....\/..||
        **=+=+=+=+=+=+**
 /*++*\
 //*++*\\
 ///*++*\\\
 ////*++*\\\\
/////*++*\\\\\
*/


