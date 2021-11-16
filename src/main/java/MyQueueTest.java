import java.util.Scanner;

/**
 * Project name(项目名称)：算法_基于数组的队列
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyQueueTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 20:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyQueueTest
{
    public static void main(String[] args)
    {
        MyQueue<String> queue = new MyQueue<>(10);
        /*
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String item = in.next();
            if (!item.equals("-"))
            {
                Q.enqueue(item);
            }
            else if (!Q.isEmpty())
            {
                System.out.println(Q.dequeue());
            }
        }
         */
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("6");
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("3");
        System.out.println(queue.dequeue());
        queue.enqueue("4");
        System.out.println(queue.dequeue());

    }
}
