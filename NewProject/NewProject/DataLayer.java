package NewProject.BusinessLayer;

import NewProject.BusinessLayer.birthDayParties;

import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;

public class DataLayer {

    private String eventType;
    private String cStarters;
    private String cMain;
    private String cDessert;
    private String eventThemes;
    private String eventAddress;
    private String dateTime;
    private int numOfPeople;

    public String getEventType() {
        return eventType;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getNumPeople() {
        return dateTime;
    }

    public void setNumPeople(int numOfPeople) {
        this.setNumOfPeople(numOfPeople);
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getEventThemes() {
        return eventThemes;
    }

    public void setEventThemes(String eventThemes) {
        this.eventThemes = eventThemes;
    }

    public String getcDessert() {
        return cDessert;
    }

    public void setcDessert(String cDessert) {
        this.cDessert = cDessert;
    }

    public String getcMain() {
        return cMain;
    }

    public void setcMain(String cMain) {
        this.cMain = cMain;
    }

    public String getcStarters() {
        return cStarters;
    }

    public void setcStarters(String cStarters) {
        this.cStarters = cStarters;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public DataLayer(String eventType, String cStarters, String cMain, String cDessert, String eventThemes,
            String eventAddress, String dateTime, int numOfPeople) {            // Contruster to initialize the variables 
        this.eventType = eventType;
        this.cStarters = cStarters;
        this.cMain = cMain;
        this.cDessert = cDessert;
        this.eventThemes = eventThemes;
        this.eventAddress = eventAddress;
        this.dateTime = dateTime;
        this.setNumOfPeople(numOfPeople);
}
    

public DataLayer(){

}



public List<DataLayer> GetClientData() throws FileNotFoundException {    // List where data from user is read and written

    List<DataLayer> datalist = new ArrayList<DataLayer>();

   File file = new File("C:\\Users\\baden\\OneDrive\\Desktop\\PRG381\\NewProject\\ClientData.txt");

   Scanner sc = new Scanner(file);

   while (sc.hasNextLine()) {
       String[] line = sc.nextLine().split(",");
       datalist.add(new DataLayer(line[0] , line[1] , line[2] , line[3] , line[4] , line[5]  , line[6] , Integer.parseInt(line[7])));
   }
   try {
    FileWriter writer = new FileWriter("ClientData");      // File writer where i take the data from the list and read it to the text file 
    Writer output = new BufferedWriter(writer);

    int sz = datalist.size();
    for(int i = 0 ; i < sz ; i++){
        output.write(datalist.get(i).toString() + "/n");
    }
    output.close();
   } catch (Exception e) {
       JOptionPane.showMessageDialog(null , "i cannot see the file");   // throwing an exception if there is no file 
   }

  String fileName = "ClientData";
  String line;
  ArrayList alist = new ArrayList<>();

  try {
      BufferedReader input = new BufferedReader(new FileReader(fileName));     // reading the data from the text file that was stored into the program and displaying it for the user 
      if (!input.ready()) {
          throw new IOException();
      }

      while ((line = input.readLine()) != null) {
          alist.add(line);
      }
      input.close();
  } catch (Exception e) {     // exception handling 
      System.out.println(e);
  }

   int sz = alist.size();
   for (int i = 0; i < sz; i++) {
       System.out.println(alist.get(i).toString());      // displaying the list data for the user 
   }



    return datalist;   // returning the list of data for the user 
}

public void GetClientData(int cChoices) {
}





}
