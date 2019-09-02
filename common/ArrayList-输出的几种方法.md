```
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		// 方法1
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		// 方法2
		for (Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		// 方法3
		for (String tmp : list) {
			System.out.println(tmp);
		}
		// 方法4
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
```
输出：
AAA
BBB
AAA
BBB
AAA
BBB
AAA
BBB