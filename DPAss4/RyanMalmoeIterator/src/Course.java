//Ryan Malmoe
import java.util.*;

public class Course implements Iterable <Students>
{
	private ArrayList <Students> myList = new ArrayList<Students>();
	public Iterator <Students> iterator()
	{
		return new CourseIterator(myList);
	}
	
	public void addStudent(Students student)
	{
		this.myList.add(student);
	}
	
	
	//nested class inside Course
		public class CourseIterator implements Iterator<Students>
		{
			private int cur;
			private ArrayList <Students> theAggregate; //will refer to myArray
			public CourseIterator(ArrayList <Students> myList)
			{
				this.theAggregate = myList;
				this.cur = 0;
			}
			
			public void remove()
			{
				throw new UnsupportedOperationException("Cannot remove a student\n");
			}

			public boolean hasNext()
			{
				return this.cur < this.theAggregate.size();
			}
			public Students next()
			{
				if(hasNext())
				{
					Students item = this.theAggregate.get(this.cur);
					this.cur++;
					return item;
				}
				throw new NoSuchElementException("Error");
			}
		}
}