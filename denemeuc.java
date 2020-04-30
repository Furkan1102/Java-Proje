package ödev;
import java.util.Scanner;
import java.util.Random;

public class denemeuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bas=0;
		Scanner giris = new Scanner(System.in);
		System.out.print("Aralýðýn ilk sayýsýný girin: \t");
		bas = giris.nextInt();
		
		int son=0;
		Scanner girisson = new Scanner(System.in);
		System.out.print("Aralýðý kapatan sayýyý giriniz: \t");
		son = giris.nextInt();
		
		if(bas > son)
		{
			int depo = bas;
			bas = son;
			son = depo;
		}
		
		Random r = new Random();
		int [] dizi = new int [10];
		for(int i = 0; i<10; i++)
		{
			dizi[i] = r.nextInt(son);
		}
		for(int i = 0; i<10; i++) 
		{
			System.out.println((i+1)+". Eleman: \t" + dizi[i]);
		}
		
		int toplam = 0;
		toplam = dizi[0]+dizi[1]+dizi[2]+dizi[3]+dizi[4]+dizi[5]+dizi[6]+dizi[7]+dizi[8]+dizi[9];
		System.out.println("Dizi Elemanlarýnýn Toplamý: \t" + toplam);
	}

}
