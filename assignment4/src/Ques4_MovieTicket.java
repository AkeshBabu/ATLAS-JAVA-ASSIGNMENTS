class MovieTicket{
    String movieName;
    String movieTime;
    String audiNumber;
    String seatNumber;

    String carNumber;


    public MovieTicket(String movieName, String movieTime, String audiNumber, String seatNumber, String carNumber ) {
        this.movieName = movieName;
        this.movieTime = movieTime;
        this.audiNumber = audiNumber;
        this.seatNumber = seatNumber;
        this.carNumber = carNumber;
    }


}

public class Ques4_MovieTicket {

    public static void  main(String [] args){

        VehicalParking vehicalParking=new VehicalParking();
        vehicalParking.parkingEnQueue(new MovieTicket("RRR","10:00","3","A15","UP32EY1234"));
        vehicalParking.parkingEnQueue(new MovieTicket("Rocketry","10:00","4","A15","UP32EY1034"));
        vehicalParking.parkingEnQueue(new MovieTicket("Avengers Endgame","10:00","1","A15","UP32EY1024"));
        vehicalParking.parkingDeQueue();
        vehicalParking.iterate();
        String frontEle=vehicalParking.front();
        System.out.println("Front Element is:"+frontEle);
    }
}
