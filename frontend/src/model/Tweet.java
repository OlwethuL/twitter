package model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import java.awt.List;
import java.util.stream.Collectors;

import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
@ManagedBean()
@SessionScoped
@Path("/MyRestService")
@ApplicationPath("/resources")

public class Tweet extends Application{
	
	public String createTweet(String tweet) throws TwitterException {
	    Twitter twitter = getTwitterinstance();
	    Status status = twitter.updateStatus("creating baeldung API");
	    return status.getText();
	}

	private Twitter getTwitterinstance() {
		// TODO Auto-generated method stub
		return null;
	}

	private String property;
	private String tweetbody;
	private Date timestamp;
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getTweetbody() {
		return tweetbody;
	}
	public void setTweetbody(String tweetbody) {
		this.tweetbody = tweetbody;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
