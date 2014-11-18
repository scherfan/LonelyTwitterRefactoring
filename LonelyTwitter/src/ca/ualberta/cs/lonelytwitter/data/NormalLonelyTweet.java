
package ca.ualberta.cs.lonelytwitter.data;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public NormalLonelyTweet()
    {
    }

    public NormalLonelyTweet(String text, Date date)
    {
        this.tweetDate = new Date();
        this.tweetBody = text;
    }

    @Override
    public boolean isValid()
    {
        if (tweetBody.trim().length() == 0 || tweetBody.trim().length() > 10)
            return false;

        return true;
    }

    @Override
    public String toString()
    {
        return getTweetDate() + " | " + getTweetBody();
    }

    @Override
    public String getTweetBody()
    {
        return tweetBody;
    }
}
