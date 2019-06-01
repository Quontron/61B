/* OpenCommercial.java */

    import java.net.*;
    import java.io.*;
    import java.util.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial1 {

    /** Prompts the user for the name X of a company (a single string), opens
     *  the Web site corresponding to www.X.com, and prints the first five lines
     *  of the Web page in reverse order.
     *  @param arg is not used.
     *  @exception Exception thrown if there are any problems parsing the
     *             user's input or opening the connection.
     */
    private static ArrayList<String> test1 = new ArrayList<>();

    public static void main(String[] arg) throws Exception {


        BufferedReader keyboard1;
        String inputLine1;

        keyboard1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine1 = keyboard1.readLine();

        URL u =  new URL(inputLine1);
        InputStream ins1 = u.openStream();
        InputStreamReader isr1 = new InputStreamReader(ins1);
        BufferedReader data = new BufferedReader(isr1);

        for(int i=0; i <=4; i++)
            test1.add(i,data.readLine());


        ListIterator iterator = test1.listIterator();

        //iterate contents forward
        while(iterator.hasNext())
            System.out.println(iterator.next() + " ");

        //iterate contents backwards
        while(iterator.hasPrevious())
            System.out.println(iterator.previous() + " ");

    }
}