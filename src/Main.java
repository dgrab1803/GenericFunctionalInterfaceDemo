package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    SomeTest<Integer> isFactor = (n,d) ->(n % d) == 0;
	    if(isFactor.test(10,2))
            System.out.println("Liczba 2 jest czynnikiem liczby 10 ");
        System.out.println();

        SomeTest<Double> isFactord = (n,d) -> (n % d) == 0;
        if(isFactord.test(10.5, 2.5))
            System.out.println("2,5 jest czynnikiem liczby 10,5 ");
        if(!isFactord.test(10.5,2.5))
            System.out.println("2.5 nie jest czynnikiem liczby 10.5 ");

        SomeTest<String> isFactors = (a,b) -> a.indexOf(b) !=-1;

        String str = "Sparametryzowana interfejs funkcyjny ";

        System.out.println("Sprawdzamy łanuch znakowy " + str);

        if(isFactors.test(str,"znakowy"))
            System.out.println(" łancuch znakowy jest w łanuchu  " + str);
        else
            System.out.println("Nie znalazł znakowy w łancuchu " + str );




    }
}
