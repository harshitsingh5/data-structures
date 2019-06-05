class Queue1
{
  int q[];
  int size, front, rear;
  Queue1()
  {
    size=10;
    q=new int[size];
    front=-1;
    rear=-1;
  }
  void addAtRear(int v){
    if(rear==size-1){                             //queue is full
      System.out.println("Overflow");
      return;
    }
    if(front==-1){                                //queue was empty And v is the first element
      q[++rear]=v;
      front=0;
      return;
    }
    else{                                         //queue contained some elements
      q[++rear]=v;
      System.out.println(v+" Added at end");
    }
  }
    int removeFromFront(){
      if(front==-1){                              //no elements in queue
        System.out.println("Underflow");
      //  return;
      }
      int x=q[front];
      if(front==rear){                          //only one element in queue
        front=-1;
        rear=-1;
        return x;
      }
      else{                                     //more than 1 element in queue
        front++;
        return x;
      }
    }
}

class Queue
{
  public static void main(String []args){
    Queue1 qq=new Queue1();
    qq.addAtRear(1);
    qq.addAtRear(2);
    qq.addAtRear(3);
    qq.addAtRear(4);
    qq.addAtRear(5);
    qq.addAtRear(6);
    System.out.println(qq.removeFromFront()+" Deleted");

  }
}
