public class SelectionSort
{
  /** The method for sorting the numbers */
  public void selectionSort(int[] list)
  {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      int currentMin = list[i];
      int currentMinIndex = i;
      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
    this.finish(list);
  }
  public void finish(int[] list)
  {
      GenericStack stack = new GenericStack();
      for (int i = 0; i < 50; i++)
      {
          stack.push(list[i]);
      }
      for (int x = 0; x < 50; x++)
      {
          System.out.println("SLOT " + (x+1) + ": " + stack.pop());
      }
  }
}