package counter;

public class Reader {
    private String text;
    private int rowCounter;
    private int letterCounter;
    private  String largestWord;

    public Reader(String  myText, String myLargestWord,  int myRowCounter, int myLetterCounter) {
        text = myText;
        rowCounter = myRowCounter;
        letterCounter = myLetterCounter;

    }

    public Reader() {
        letterCounter = 0;
        rowCounter = 0;
        int max = 0;
        String largestWord = "";
        text = "";

    }



   /* public void textReader() {

        Scanner scan = new Scanner(System.in);
        int max = 0;
        String largestWord = "";


        while (true) {

            text = scan.nextLine();
            if (text.equals("stop")) {
                System.out.println("You have entered \"Stop\"!");
                break;
            } else {


                letterCounter += text.length();
                if (!text.isEmpty()) {
                    rowCounter += 1;

                    if (text.length() > max) {
                        max = text.length();
                        largestWord = text;

                    }
                }


            }


        }//while


        System.out.println("The count of letter is: " + letterCounter + "\n" +
                " The count of rows is: " + rowCounter + "\n The largest word was: " + largestWord);


    }*/

    public int getLetterCounter() {
        return letterCounter;
    }


    public void setChar(String text) {

        letterCounter += text.length();
        System.out.println("your characters number is " + letterCounter);
    }

    /*public boolean containsStop()

        {
            Scanner scan = new Scanner(System.in);
            while (true) {

                text = scan.nextLine();
                if (text.equals("stop")) {
                    System.out.println("You have entered \"Stop\"!");
                    break;
                }
            }
            return false;
        }*/




    public void setRows() {
            rowCounter += 1;
        System.out.println("your rows number is " + rowCounter);
    }


   /* public void checkIfContainsStop(String text) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            text = scan.nextLine();
            if (text.equals("stop")) {
                System.out.println("You have entered \"Stop\"!");
                break;
            }
        }

    }*/

    public int getRowCounter() {
        return rowCounter;
    }




    public void checkIfContainsStop(String word) {

    }




    public boolean containsStop() {
        return true;
    }





    public boolean containshejsan() {
        return false;
    }




    public void setLargestWord(String text) {
        int max = 0;
        if (text.length() > max) {
            max = text.length();
            largestWord = text;
          System.out.println(largestWord);
        }

    }




    public String getLargestWord() {
        return largestWord;
    }
}