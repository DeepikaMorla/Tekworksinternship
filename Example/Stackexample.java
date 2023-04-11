class Stackexample {
   private int maxSize;
   private long[] stackArray;
   private int top;
   
   public Stackexample(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
      stackArray[++top] = j;
   }
   public long pop() {
      return stackArray[top--];
   }
   public long peek() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) {
      Stackexample st = new Stackexample(10); 
      st.push(10);
      st.push(20);
      st.push(30);
      st.push(40);
      st.push(50);
      
      while (!st.isEmpty()) {
         long value = st.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}