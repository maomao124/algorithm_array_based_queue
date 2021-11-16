import java.awt.*;

/**
 * Project name(项目名称)：算法_基于数组的队列
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyQueue
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 20:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyQueue<T>
{
    private T[] Q;
    private int head;
    private int tail;
    private int size;

    public MyQueue()
    {
        this(1);
    }
    @SuppressWarnings("unchecked")
    public MyQueue(int capacity)
    {
        Q = (T[]) new Object[capacity];
        size = 0;
        head = tail = 0;
    }

    /**
     * 入队操作
     *
     * @param item
     */
    public void enqueue(T item)
    {
        /********** Begin *********/
        tail++;
        Q[tail -1] = item;
        size++;

        /********** End *********/
    }

    /**
     * 出队操作
     *
     * @return
     */
    public T dequeue()
    {

        /********** Begin *********/
        if (size <= 0)
        {
            System.out.println("队空！！！");
            Toolkit.getDefaultToolkit().beep();
            return null;
        }
        T result;
        result = Q[head];
        size--;
        head++;
        return result;

        /********** End *********/
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return (head == tail) && (size < Q.length);
    }

    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(Q[i+head]+" ");
        }
        System.out.println();
    }

    public int size()
    {
        return size;
    }

}
