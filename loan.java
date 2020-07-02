import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class loan {
    //public final Object loanamount;
    //public final Object tenure;
    //public final Object loanApplicantName;

    public static void main(String[] args) {
        ArrayList<loan> ar = new ArrayList<loan>();
        ar.add(new loan(10000, 2000, "ram"));
        ar.add(new loan(20000, 5000, "sham"));
        ar.add(new loan(30000, 3000, "hari"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbytenure());

        System.out.println("\nSorted by tenure");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new SortbyloanApplicantName());

        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


    }
    double loanamount;
    int tenure;
    String loanApplicantName;
    public loan(double loanamount,int tenure,String loanApplicantName){
        this.loanamount = loanamount;
        this.tenure = tenure;
        this.loanApplicantName = loanApplicantName;
    }
    public String toString()
    {
        return this.loanamount + " " + this.tenure +
                " " + this.loanApplicantName;
    }



}
class Sortbytenure implements Comparator<loan>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(loan a, loan b)
    {

        return a.tenure-b.tenure;
    }
}
class SortbyloanApplicantName implements Comparator<loan>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(loan a, loan b)
    {
        return a.loanApplicantName.compareTo(b.loanApplicantName);
    }
}





/*class Main
{
    public static void main (String[] args)
    {
        ArrayList<loan> ar = new ArrayList<loan>();
        ar.add(new loan(10000, 2000, "london"));
        ar.add(new loan(20000, 1000, "nyc"));
        ar.add(new loan(30000, 3000, "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbytenure());

        System.out.println("\nSorted by tenure");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}

 */