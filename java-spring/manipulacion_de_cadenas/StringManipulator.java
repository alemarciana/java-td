public class StringManipulator {
	public String trimAndConcat(String strA, String strB){
		return strA.trim()+strB.trim();
	}
	public Integer getIndexOrNull(String str, char ch){
		int a = str.indexOf(ch);
		if ( a == -1) {
			return null;
		}
		else {
			return a;
		}
	}
	public Integer getIndexOrNull(String str1, String str2){
		int a = str1.indexOf(str2);
		if ( a == -1) {
			return null;
		}
		else {
			return a;
		}
	}
	public String concatSubstring(String str1, int iIndex, int fIndex, String str2){
		String substr = str1.substring(iIndex,fIndex);
		return substr + str2;
	}
}
