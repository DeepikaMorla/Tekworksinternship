import java.util.*;
class TodolistImp implements TodolistInterface
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<> td = new ArrayList<>();
    

 

    public void add()
    {
      System.out.println("enter the task ");
      String task = sc.next();
      td.add(new ShoppingData(task));
      
    }
    public void remove()
    {
      if(td.size() == 0){
        System.out.println("no task available for deleting");
      }else{
        String verify = null;
        System.out.println("enter task name to remove the entire task");
        String task1 = sc.next();
        for(TodolistData e : td){
          if(e.getTask_name().equals(task1)){
            td.remove(e);
            verify = "found";
            break;
          }
        }
        if(verify == null){
          System.out.println("already removed the task from the database");
        }
      }
    }
	public void update()
	{
		System.out.println("enter the task to be updated:");
		String t=sc.nextLine();
		td.add(new TodolistData(t));
	}
    public void display()
    {
      if(td.size() == 0){
        System.out.println("no task available for display");
      }else{
        Iterator itr = td.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
    }
  }