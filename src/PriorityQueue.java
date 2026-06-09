/*
   Created by: Aidan J. Bridgers
   Priority Queue Object
   File: PriorityQueue.java
 */

import java.util.LinkedList;

public class PriorityQueue<T extends Comparable>
{
    private LinkedList<T> pq;

    public PriorityQueue()
    {
        pq = new LinkedList<T>(); // Initialize the priority queue
    }

    public void push(T data)
    {
        if (pq.isEmpty())
        {
            pq.add(data);
            return;
        }

        int position = 0;

        while (position < pq.size() && pq.get(position).compareTo(data) > 0) // Find the position to insert the new data
        {
            position++;
        }

        pq.add(position, data);
    }

    public void pop()
    {
        if (pq.isEmpty())
        {
            System.out.println("Nothing to pop: the priority queue is empty");
            return;
        }

        T removed = pq.removeLast();

        if (removed instanceof Patient)
        {
            Patient temp = (Patient) removed;
            System.out.println("'" + temp.getName() + "' served from the priority queue");
        }
        else
        {
            System.out.println("'" + removed + "' served from the priority queue");
        }
    }

    public T peek()
    {
        if (pq.isEmpty())
        {
            System.out.println("Nothing to see here: the priority queue is empty");
            return null;
        }

        return pq.getLast();
    }

    public boolean isEmpty()
    {
        return pq.isEmpty();
    }

    public int getSize()
    {
        return pq.size();
    }

    public void print()
    {
        if (pq.isEmpty())
        {
            System.out.println("Nothing to print: the priority queue is empty");
            return;
        }

        for (int i = 0; i < pq.size(); i++) // Traverses and prints the priority queue
        {
            System.out.print(pq.get(i));

            if (i < pq.size() - 1)
            {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    public void printJustNames()
    {
        if (pq.isEmpty())
        {
            System.out.println("Nothing to print: the priority queue is empty");
            return;
        }

        for (int i = 0; i < pq.size(); i++)
        {
            T current = pq.get(i);

            if (current instanceof Patient)
            {
                Patient temp = (Patient) current;
                System.out.print(temp.getName());
            }
            else
            {
                System.out.print(current);
            }

            if (i < pq.size() - 1)
            {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    /*
     * These two methods are included because the PDF UML uses capitalized
     * Print() and PrintJustNames(). If your driver uses lowercase methods,
     * those also work.
     */
    public void Print()
    {
        print();
    }

    public void PrintJustNames()
    {
        printJustNames();
    }
}