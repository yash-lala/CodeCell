class ColoredPoints{
	public static void main(String[] args) {
		String one = "Through three cheese trees three free fleas flew. While these fleas flew, freezy breeze blew. Freezy breeze made these three trees freeze. Freezy trees made these trees’ cheese freeze. That’s what made these three free fleas sneeze.";
		String two = "I was just beginning to yawn with nerves thinking he was trying to make a fool of me when I knew his tattarrattat at the door.";
		String three = "Betty Botter bought some butter, but, she said, the butter’s bitter; if I put it in my batter it will make my batter bitter, but a bit of better butter will make my batter better. So she bought a bit of butter better than her bitter butter, and she put it in her batter and the batter was not bitter. So ’twas better Betty Botter bought a bit of better butter.";
		one = one.toLowerCase().replaceAll("\\s+","").replaceAll("\\p{P}", "");
		two = two.toLowerCase().replaceAll("\\s+","").replaceAll("\\p{P}", "");
		three = three.toLowerCase().replaceAll("\\s+","").replaceAll("\\p{P}", "");
		System.out.println(dotsRemovable(one)*dotsRemovable(two)*dotsRemovable(three));		
	}

	static int dotsRemovable(String ip){
		StringBuilder stringBuilder = new StringBuilder(ip);
		int dots=0;int pointer=1;
		while(pointer != stringBuilder.length()){
			if(stringBuilder.charAt(pointer)!=stringBuilder.charAt(pointer-1))
				pointer++;
			else{
				dots++;
				stringBuilder.deleteCharAt(pointer);
				stringBuilder.deleteCharAt(pointer-1);
				pointer--;
			}

		}
		return dots;
	}
}