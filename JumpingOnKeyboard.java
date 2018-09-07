class JumpingOnKeyboard{
	public static void main(String[] args) {
		String one = "supercalifragilisticexpialidocious";
		String two = "antidisestablishmentarianis";
		System.out.println(getJumps(one)*getJumps(two));
	}

	static int getJumps(String data){
		int jumps =0;
		for(int i=0;i<data.length()-1;i++){
			jumps += Math.abs((int)data.charAt(i) - (int)data.charAt(i+1))-1;
		}
		return jumps;
	}
}