package controller;

import java.awt.List;
import java.util.stream.Collectors;

import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TweetController {
	public List getTimeLine() throws TwitterException {
	    Twitter twitter = getTwitterinstance();
	     
	    return (List) twitter.getHomeTimeline().stream()
	      .map(item -> item.getText())
	      .collect(Collectors.toList());
	}

	private static Twitter getTwitterinstance() {
		// TODO Auto-generated method stub
		return null;
	}
	

public static String sendDirectMessage(String recipientName, String msg) 
		  throws TwitterException {
		  
		    Twitter twitter = getTwitterinstance();
		    DirectMessage message = twitter.sendDirectMessage("@AdhLecturer", "220047016 ADH Project");
		    return message.getText();
		}

public static List searchtweets() throws TwitterException {
	  
    Twitter twitter = getTwitterinstance();
    Query query = new Query("source:twitter4j baeldung");
    QueryResult result = twitter.search(query);
     
    return (List) result.getTweets().stream()
      .map(item -> item.getText())
      .collect(Collectors.toList());
}
}
