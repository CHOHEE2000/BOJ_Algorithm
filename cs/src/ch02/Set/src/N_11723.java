import java.util.Scanner;
import java.util.ArrayList;

public class N_11723 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int M = sc.nextInt();
		int i = 1, j, x = 0;
		String menu = "";
		sc.nextLine();
		
		menu = sc.next();
		if(menu.equals("add") || menu.equals("remove") || menu.equals("check") || menu.equals("toggle")) 			
			x = sc.nextInt();
		
		
		while(i != M) {
			switch(menu) {
				case "add":
					array.add(x);
					break;
				case "check":
					if(array.contains(x))
						System.out.print("1\n");
					else
						System.out.print("0\n");
					break;
				case "remove":
					for(j = 0; j < array.size(); j++) {
						if(array.get(j) == x)
							array.remove(j);						
					}		
					break;
				case "toggle":
					if(array.contains(x)) {
						for(j = 0; j < array.size(); j++) {
							if(array.get(j) == x) {
								array.remove(j);
								break;
							}
						}
					}
					else
						array.add(x);

					break;
				case "all":
					array.clear();
					for(j = 1; j < 20; j++) 
						array.add(j);
					break;
				case "empty":
					array.clear();
					break;
			}
			i++;
			sc.nextLine();
			menu = sc.next();
			if(menu.equals("add") || menu.equals("remove") || menu.equals("check") || menu.equals("toggle")) 			
				x = sc.nextInt();

		}
		sc.close();
	}

}
