package mediatic;

import com.google.common.base.Strings;

import worker.MyStringUtils;

public class Test {
	
	
	public static void main(String[] args) {
		System.out.println(MyStringUtils.isNullOrEmpty("hello world"));
		System.out.println(Strings.repeat("hello world", 10));
		
		/* j'ajoute pour tester*/
	}
}
