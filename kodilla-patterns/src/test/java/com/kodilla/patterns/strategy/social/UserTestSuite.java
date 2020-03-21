package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials ("John");
        User edel = new YGeneration ("Edel");
        User jay = new ZGeneration ("Jay");
        //When
        String johnSharePost=john.sharePost();
        System.out.println ("John share a post on " + johnSharePost);
        String edelSharePost=edel.sharePost();
        System.out.println("Edel share a post on " + edelSharePost);
        String jaySharePost=jay.sharePost();
        System.out.println ("Jay share a post on " + jaySharePost);
        //Then
        Assert.assertEquals ("Facebook", johnSharePost);
        Assert.assertEquals ("Snapchat", edelSharePost);
        Assert.assertEquals ("Twitter", jaySharePost);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials ("John");
        User edel = new YGeneration ("Edel");
        User jay = new ZGeneration ("Jay");
        //When
        String johnSharePost=john.sharePost();
        System.out.println ("John share a post on " + johnSharePost);
        john.setPostSharing(new TwitterPublisher());
        johnSharePost=john.sharePost();
        System.out.println ("John now share a post on " + johnSharePost);

        String edelSharePost=edel.sharePost();
        System.out.println ("Edel share a post on " + edelSharePost);
        edel.setPostSharing (new FacebookPublisher ());
        edelSharePost=edel.sharePost ();
        System.out.println ("Edel now share a post on " + edelSharePost);

        String jaySharePost=jay.sharePost();
        System.out.println ("Jay share a post on " + jaySharePost);
        jay.setPostSharing (new FacebookPublisher());
        jaySharePost=jay.sharePost ();
        System.out.println ("Jay now share post on " + jaySharePost);

        //Then
        Assert.assertEquals ("Twitter", johnSharePost);
        Assert.assertEquals ("Facebook", edelSharePost);
        Assert.assertEquals ("Facebook", jaySharePost);
    }
}
