

public class Post

{
    

    public String postContent;

    public String postUserName;

    public Post(String postUserName, String postContent)

    {     

        this.postContent=postContent; 

        this.postUserName=postUserName;

    }   

        

    public String getUserPost()

    {             

        return postContent;       

    }

    

    public String getUserName()

    {             

        return postUserName;       

    }

    

    

}
    
