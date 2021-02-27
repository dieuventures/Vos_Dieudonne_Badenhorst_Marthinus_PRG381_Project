package NewProject.BusinessLayer;



public class eventPlanning {
    events Event ;

    public events menuPlanning(int num){

        switch (num) {
            case 1: 
            Event = new Wedding();
                
                break;
            
            case 2: 
            Event = new birthDayParties();

                break;

            case 3: 
            Event = new Funerals();

                break;

            case 4:
            Event = new otherEvent();

                break;
        
            default:
                break;
        }





        return Event;
    }
}
