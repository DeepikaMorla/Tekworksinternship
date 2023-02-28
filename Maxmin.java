class Maxmin
{
    public static void MinandMax(int[] n)
    {
        int max = n[0];
        int min = n[0];
        for (int i = 1; i < n.length; i++)
        {
            if (n[i] > max) {
                max = n[i];
            }
            else if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
 
    public static void main(String[] args)
    {
        int[] n = { 5, 7, 2, 4, 9, 6 };
        MinandMax(n);
    }
}