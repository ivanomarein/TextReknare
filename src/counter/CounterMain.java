package counter;


import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {


        System.out.println("Please enter your text below:");
        String text ;
        Reader myReader = new Reader("","" ,0, 0);
        Scanner scan = new Scanner(System.in);



        while (true) {

            text = scan.nextLine();
            if (text.equals("stop")) {
                System.out.println("You have entered \"Stop\"!");
                break;
            } else {


                myReader.setChar(text);
                if (!text.isEmpty()) {
                    myReader.setRows();


                  myReader.setLargestWord(text);
                    }
                }


            }


        }//while

    }//end main

