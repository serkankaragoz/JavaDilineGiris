import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // Dosya okumak icin farkli yontemler vardir.
        // Scaner nesnesi kullanmak da bu yontemlerden biridir.
        Scanner scanner = new Scanner(new File("grades.txt"));
        // Scanner sinifinin icine aldiginiz degisken veriyi hangi yola alacaginizi belirtir.
        // Hatirlarsaniz konsol ekranindan bilgi almak icin System.in degiskenini kullaniyorduk.
        // Eger buraya File türünden bir nesne koyarsak Scanner nesnesi belirtilen dosyayi okur.

        double total = 0;
        int gradeCount = 0;

        // scanner.hasNextLine() metodu dosyada sonraki bir satir olup olmadigini dondurur.
        while (scanner.hasNextLine()){
            total += scanner.nextInt();
            gradeCount++;
        }

        double avg = total / gradeCount;
        System.out.println("Average: " + avg);

        // Dosyalara yazi yazmak icin kullanilan yontemlerden birisi de BufferedWrite nesnesi kullanmaktir.
        // FileWriter nesnesinin aldigi ikinci arguman yazma islemi sirasinda yeni yazilarin eski yazilarin uzerine yazilip
        // yazilmayacagimi kontrol eder.
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.txt", false));

        bufferedWriter.write("Serkan\n");
        bufferedWriter.write("123456\n");
        bufferedWriter.write("aefeae");

        bufferedWriter.close(); // Yazma islemi tamamlaninca dosya kapatilmalidir.

    }
}