// 导入日期和时间类
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 定义一个自动时钟类
public class AutoClock {

  // 定义一个格式化器，用于显示24小时制的时间
  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

  // 定义一个主方法，用于启动时钟
  public static void main(String[] args) {

    // 创建一个无限循环，每秒更新一次时间
    while (true) {

      // 获取当前的本地时间
      LocalTime now = LocalTime.now();

      // 格式化并打印当前时间
      System.out.println(formatter.format(now));

      // 使线程暂停一秒，模拟时钟的走动
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
