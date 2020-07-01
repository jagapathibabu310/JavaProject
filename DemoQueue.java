package sample;

public class DemoQueue 
{

	public static void main(String[] args) 
	{
		Queue q = new Queue(5);
		q.queueEnqueue(10);
		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		
		q.display();
		
	}

}

class Queue
{
	int front,rear,capacity;
	int queue[];
	
	Queue(int c)
	{
		front=rear=0;
		capacity=c;
		queue=new int[capacity];
	}
	public void queueEnqueue(int data)
	{
		if(capacity==rear)
			System.out.println("queue is full");
		else
		{
			queue[rear]=data;
			rear++;
		}
	
	}
	public void display()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
		}
		for(int i=front;i<rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
}

