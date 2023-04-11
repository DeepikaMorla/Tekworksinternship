class IllegalArgumentException extends Exception
  {
    String str;
    public IllegalArgumentException(String str)
    {
      this.str=str;
    }
    String get()
    {
      return str;
    }
  }
class EvenArray {
    private int[] arr;
    private int size;
    private int currentIndex;

    public EvenArray(int size) {
        arr = new int[size];
        this.size = size;
        currentIndex = 0;
    }

    public void add(int number) {
        if (currentIndex >= size) {
            System.out.println("Array is full.");
        }
        arr[currentIndex] = number;
        currentIndex++;
    }

    public void testEven() {
        for (int i = 0; i < currentIndex; i++) {
            int number = arr[i];
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                throw new IllegalArgumentException(number + " is not even.");
            }
        }
    }
}
class EvenMain
  {
    public static void main(String args[])
    {
      EvenArray array[]=new EvenArray[6];
      try{
        for(int i=0;i<6;i++){
          array[i].testEven();
      }
      }  
        catch(IllegalArgumentException e){
        System.out.println("Error"+e.get());
      }
    }
  }
