import java.util.Arrays;

public class App {
    /*
     * Kendi Liste Sınıfımızı Yazmak
     * 
     * 
     * Java'da generic yapısını kullanarak verileri tuttuğumuz bir sınıf
     * tasarlıyoruz.
     * 
     * Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini
     * dinamik olarak alması. Bunun için generic bir sınıf oluşturulması gerekli.
     * 
     * 
     * 
     * NOT : COLLECTION SINIFI KULLANILMAYACAKTIR ! KENDİ LİSTE SINIFIMIZI
     * OLUŞTURMALIYIZ.
     * 
     * 
     * 
     * Sınıf özellikleri :
     * 
     * 
     * 
     * Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı
     * ihtiyaç duydukça 2 katı şeklinde artmalı.
     * 
     * 
     * Sınıfa ait iki tür constructor metot bulunmalı
     * 
     * 
     * MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
     * 
     * 
     * MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden
     * alınmalıdır.
     * 
     * 
     * size() : dizideki eleman sayısını verir.
     * 
     * 
     * getCapacity() : dizinin kapasite değerini verir.
     * 
     * 
     * add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer
     * dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
     * 
     */
    public static void main(String[] args) throws Exception {
        MyList<Integer> deneme = new MyList<>(2);
        deneme.add(5);
        deneme.add(10);
        System.out.println(deneme.size());
        System.out.println(deneme.getCapacity());
        deneme.add(15);
        deneme.add(20);
        deneme.add(25);
        Integer a = deneme.remove(2);
        System.out.println(deneme.get(5));
        System.out.println(Arrays.toString(deneme.toArray()));
    }
}