import java.util.concurrent.ThreadLocalRandom;
/**
 * Write a description of class finder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finder
{
    // creates heap, the list, and keeps track of total primes.
    SelectionSort select = new SelectionSort();
    int[] list = new int[50];
    int count = 0;
    public void activate()
    {
        // randomly generates a number between 0-100, and if its not a prime it recursively resets but retains
        // its place.
        for (count = count; count < 50; count++)
        {
            list[count] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            if ( !(this.isPrime(list[count])) )
            {
                this.activate();
            }
            else if ( this.isPrime(list[count]) )
            {
                System.out.println("PRIME: " + list[count]);
                System.out.println("COUNT: " + count);
            }
        }
        select.selectionSort(list);
    }
    public boolean isPrime(int number)
    {
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
