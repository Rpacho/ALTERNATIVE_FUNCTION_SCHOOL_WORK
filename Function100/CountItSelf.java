
public class CountItSelf{
	


	public static boolean countAByItSelf(int[] arr){
		int count;
		boolean result = false
		for(int i = 0; i < arr.length;i++){
			int selected = arr[i];
			count = 0;
			for(int j = 0; j < arr.length; j++){
				if (selected == arr[j]){
					count++;
				}
			}
			if (selected < count){
				return false;
			}
			if (selected == count)
		}
		return result;

	}
	public static void main(String[] args){
		int[] array = {5, 2, 3, 4, 3};
		System.out.println(countAByItSelf(array));



	}
}