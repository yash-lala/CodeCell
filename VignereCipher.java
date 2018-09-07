class VignereCipher{
	static String key = "Code";
	static String text = "Just finished the TSEC CodeCell Challenge";
	public static void main(String[] args) {
		text = text.toLowerCase().replaceAll("\\s+","");
		key = key.toLowerCase().replaceAll("\\s+","");
		for(int i =0; i<text.length(); i++){
			System.out.print(  (char)((((((int)key.charAt(i%key.length())-97)+((int)text.charAt(i))-97))%26)+97));
		}
	}
}
