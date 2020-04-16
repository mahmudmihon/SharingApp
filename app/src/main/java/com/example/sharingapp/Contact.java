import java.util.UUID;

public class Contact
{
    private string username;
    private string email;
    private string id;

    public ​Contact(String username, String email, String id)
    {
        ​this​.​username ​= username;
        ​this​.​email ​= email;

        ​if ​(id == ​null​)
        {
            setId();
        } ​
        else 
        ​{
            updateId(id);
        }
    }

    public void ​setId() 
    {
        ​this​.​id ​= UUID.​randomUUID​().toString();
    }

    public String getId()
    {
        return this.id;
    }

    public void ​updateId(String id)
    {
        ​this​.​id ​= id;
    }

    public void setUsername(String name)
    {
        this.username = name;
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }
}