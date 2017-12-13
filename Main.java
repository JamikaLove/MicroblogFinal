import static java.lang.System.out;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Iterator;

public class Main

{

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args)

    {

       

        System.out.println("");          

         

               

        Post[] posts = 
        {          

            new Post("BeyonceKnowles", "Uh-oh,Uh-oh,Uh-oh Uh-oh"),

            new Post("JamikaLove", "Hi."),

            new Post("MichelleMiller","Can anyone recommend a good doctor?"),

            new Post("BeyonceKnowles", "He's got a big ego!!!"),

            new Post("BeyonceKnowles","Such a huge ego!!!"),

                          

        }; 

        userDetails[] users = 
        {

            new userDetails("www.facebook.com\n", "JamikaLove\n", "Jamika Love-Logan\n", "JamikaLove@hotmail.com\n"),

            new userDetails("www.facebook.com\n", "MichelleMiller\n", "Michelle Miller\n", "Michelle.Ha@nobody.com\n"),

            new userDetails("www.facebook.com\n", "BeyonceKnowles\n", "Beyonce Knowles\n", "Beyonce@Beyonce.com\n"),               

        };       

        for (int i = 0; i < posts.length; i++) {

            System.out.println("\nBlog("+(i+1) +") "+ posts[i].getUserName()+"\n"+posts[i].getUserPost());

            

                      

        }

        System.out.println(""); 

        
        for (int i = 0; i < users.length; i++) {

            System.out.println("User Information: "+users[i].getuserDetails()+"\n");           

            

          

        }

                

    }    

}



        
        
