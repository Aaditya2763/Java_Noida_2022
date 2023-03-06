package lecture26;

public class coinCoin_Permutation {
public static void main(String[] args) {
	int[] coin = {2,3,5,6};
	int amount=10;
	coin_Per(coin,amount,"");
}
public static  void coin_Per(int []coin ,int amount,String ans) {
	if(amount==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<coin.length;i++) {
		if(amount>=coin[i]) {
			//due to infinite supply we  have all the coins available again
			//that is why we are using i not i+1
			//refer queen combination Question for more info
			coin_Per(coin, amount-coin[i], ans+coin[i]);
			// if we have finite supply we have to increase the  value  of  i by i+1;
		}
	}
	
}
 
}
