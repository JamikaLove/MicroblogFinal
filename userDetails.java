public class userDetails

{

    public String profilePic;

    public String userName;

    private String realName;

    public String emailAddress;



    public userDetails(String profilePic, String userName, String realName, String emailAddress)

    {

        this.profilePic =profilePic;

        this.userName=userName;

        this.realName=realName;

        this.emailAddress=emailAddress;

    }

    

    public String getuserDetails()

    { 

        return userName+realName+profilePic+emailAddress ;

    }



}