package test;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;

public class SearchTest extends BaseClass {

    @Test
    public void search() {
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.searchPageitem();
    }
}
