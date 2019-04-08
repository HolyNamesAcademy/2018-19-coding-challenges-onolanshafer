package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
        int largest = 0;
        int smallest = 0;
        int middle = 0;
        if(a > b){
            if (a > c){
                largest = a;
                if(b > c){
                    middle = b;
                    smallest = c;
                }
                else{
                    middle = c;
                    smallest = b;
                }
            }
            else{
                largest = c;
                middle = a;
                smallest = b;
            }
        }
        else{
            if(b > c){
                largest = b;
                if(c > a){
                    middle = c;
                    smallest = a;
                }
                else{
                    middle = a;
                    smallest = c;
                }
            }
            else {
                largest = c;
                if(a < b){
                    middle = b;
                    smallest = a;
                }
                else {
                    middle = a;
                    smallest = b;
                }
            }
        }
        //check to make sure the differences are even
        if((largest - middle) == (middle - smallest)){
            return true;
        }
        return false;
    }
}
