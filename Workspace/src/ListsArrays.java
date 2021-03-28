import java.util.ArrayList;
import java.util.List;
public class ListsArrays {
    public static void main(String[] args) throws Exception {
        /*List<String> l1 = new ArrayList<>();
		l1.add("1");
		l1.add("2");

		List<String> l2 = new ArrayList<>();
		l2.add("3");
		l2.add("4");
		l2.add("5");

		List<String>[] arrayOfList = new List[2];
		arrayOfList[0] = l1;
		arrayOfList[1] = l2;

		for (int i = 0; i < arrayOfList.length; i++) {
			List<String> l = arrayOfList[i];
			System.out.println(l);

        } */
        /*ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> singleList = new ArrayList<String>();
        singleList.add("hello");
        singleList.add("world");
        listOLists.add(singleList);

        ArrayList<String> anotherList = new ArrayList<String>();
        anotherList.add("this is another list");
        listOLists.add(anotherList);
        System.out.println(singleList);*/
        ArrayList<String> l1 = new ArrayList<String> ();

        l1.add ("Selina Wang");
        l1.add ("Isabella Wang");
        l1.add ("Leo Wang");
        l1.add ("Mabel Zhang");
        System.out.println(l1);

        for (String name : l1) {
            System.out.printf("Sunnyvale Resident: %s\n", name);
        }


    }
    
}
