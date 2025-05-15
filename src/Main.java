package src;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] movie_name = new String[] {"我的名字","K-O", "涼宮春日的", "GIVEN"};
        MovieType[] movieTypes = new MovieType[]{MovieType.NEW_RELEASE, MovieType.REGULAR, MovieType.REGULAR, MovieType.CHILDREN};
        String[] customer_name = new String[] {"倫倫","六花醬", "K昂", "史家瑩"};
        Map<String, Movie> movies = new HashMap<>();
        Map<String, Customer> customers = new HashMap<>();

        for (String s : customer_name) {
            customers.put(s, new Customer(s));
        }
        for(int i = 0; i < movie_name.length; i++){
            movies.put(movie_name[i], new Movie(movie_name[i], movieTypes[i]));
        }
        String[] rentCustomer = new String[]{"倫倫", "倫倫", "六花醬", "六花醬", "六花醬", "K昂", "史家瑩"};
        String[] rentMovie = new String[]{"GIVEN", "我的名字", "我的名字", "K-O", "涼宮春日的", "K-O", "GIVEN"};
        int[] rentDay = new int[]{8, 7, 8, 7, 8, 7, 8};

        for (int i = 0; i < rentDay.length; i++){
            String customer = rentCustomer[i];
            String movie = rentMovie[i];
            int day = rentDay[i];
            customers.get(customer).rent(movies.get(movie), day);
        }

        for(String c : customer_name){
            customers.get(c).statement();
            System.out.println();
        }
        movies.get("我的名字").setType(MovieType.REGULAR);
    }
}
