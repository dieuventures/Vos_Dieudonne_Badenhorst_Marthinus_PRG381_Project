package Project;
import java.util.*;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.sql.Time;



public class Planners {

    private String eventType;
    private Date eventDate;
    private Time eventTime;
    private String address;
    private int people;
    private int amountOfPeople;
    private String menu;
    private String decor;

    public Planners(String eventType, Date eventDate, Time eventTime, String address, int people, int amountOfPeople,
            String menu, String decor) {
        this.setEventType(eventType);
        this.setEventDate(eventDate);
        this.setEventTime(eventTime);
        this.setAddress(address);
        this.setPeople(people);
        this.setAmountOfPeople(amountOfPeople);
        this.setMenu(menu);
        this.setDecor(decor);
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDecor() {
        return decor;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Time getEventTime() {
        return eventTime;
    }

    public void setEventTime(Time eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Planners(){

    }

    public List<Planners> allData() throws FileNotFoundException{

        menu menuData = new menu();
        decor decorData = new decor();
        events eventData = new events();

        List<Planners> planlist = menuData.getMenu();
        List<Planners> planslist = decorData.getDecor();
        List<Planners> planList = eventData.getEvents();

        return planlist;
        
    }




}
