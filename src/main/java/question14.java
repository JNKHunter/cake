/**
 * Created by jhunter on 12/6/16.
 */
public class question14 {
    public static void main(String[] args) {

        int[] movies = {
                180,
                200,
                40,
                90,
                120,
                260,
                10,
                120
        };

        System.out.println(isSumLengthOfFlight(50, movies));
    }


    public static boolean isSumLengthOfFlight(int flightLength, int[] movieLengths){

        int shortest = flightLength;
        int secondShortest = flightLength;

        for(int movie : movieLengths){
            if(movie < shortest){
                secondShortest = shortest;
                shortest = movie;
            }else if(movie < secondShortest){
                secondShortest = movie;
            }
        }

        return secondShortest + shortest < flightLength ? true : false;
    }
}
