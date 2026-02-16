package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
      System.out.println(area(5.0)); 

      System.out.println(hasTeen(23, 99, 1)); 


    }

//Hedeflerimiz:
//Havlayan Köpeğimiz
//Havlamayı seven bir köpeğimiz var. Eğer köpeğimiz geceleri havlarsa uyanacağız ama gündüzleri havlarsa tepki vermeyeceğimiz bir metod yazmaya çalışacağız.
//shouldWakeUp isimli metodumuz 2 tane parametre almalı. İlk parametre boolean olmalı ve köpeğin şu an havlayıp havlamadığını tutmalı.
//İkinci parametremiz int değer almalı. 0-23 arasında değer alabilir. Köpeğimiz akşam 8 ile sabah 8 arasında havlıyorsa metod true değer dönmeli.
//Diğer şartlar altında metodumuz false değer dönmeli.
//İkinci parametre 0'dan küçükse ya da 23'den büyükse metodumuz yine false değer dönmeli.
//shouldWakeUp (true, 1); => true dönmeli(Gece 1'de köpeğimiz havlıyor)
//
//shouldWakeUp (false, 2); => false dönmeli.(köpek havlamıyor.)
//
//shouldWakeUp (true, 8); => false dönmeli.(8'den sonra ise tepki vermeliyiz.)
//
//shouldWakeUp (true, -1); => false dönmeli(-1 geçersiz değer)
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock<0 || clock>23) {//İkinci parametre 0'dan küçükse ya da 23'den büyükse metodumuz yine false değer dönmeli.
            return false;}
        if(isBarking && (clock<8 || clock >=20)) {
            return true;
        }
        return false;
    }

//Yaş Tespiti
//hasTeen isimli 3 tane parametre alan bir metod yazmak istiyoruz.
//3 parametreden herhangi biri eğer 13-19 arasındaysa metod true değer dönmeli
//Diğer şartlarda false değer dönmeli.
//hasTeen(9, 99, 19); => true dönmeli.(19 değerinden dolayı)
//
//hasTeen(23, 15, 42); => true dönmeli.(15 değerinden dolayı)
//
//hasTeen(22, 23, 34); => false dönemli(Hiçbir değer 13-19 arasında değil.)
public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
    return (firstAge >= 13 && firstAge <= 19) ||
            (secondAge >= 13 && secondAge <= 19) ||
            (thirdAge >= 13 && thirdAge <= 19);
}
//### Oyuncu Kedi
//
//* Oyun oynamayı çok seven bir kedimiz var. Kedimizin oyun oynadığı zamanları tespit etmek için bir metod yazacağız.
//* Kedimiz sıcaklık 25 ile 35 arasındaysa oyun oynuyor olucak. Eğer mevsim yaz değilse. Mevsim yaz ise üst limit 35 yerine 45 olmalı.
//* ```isCatPlaying``` isimli 2 tane parametre alan bir metod yazmak istiyoruz. Eğer kedi oyun oynuyorsa metodumuz ```true``` değer dönecek. Oyun oynamıyorsa ```false``` değer dönecek.
//* İlk parametre ```boolean``` değer tutmalı ve mevsimin yaz olup olmadığını kontrol etmeli
//* İkinci parametre ```int``` olamlı ve sıcaklık değerini tutmalı.
//
//
//isCatPlaying(true, 10); => false dönmeli(sıcaklık 25-45 arasında olmalıydı)
//
//isCatPlaying(false, 36); => false dönmeli(sıcaklık 25-35 arasında olmalıydı)
//
//isCatPlaying(false, 35); => true dönmeli(sıcaklık 25-35 arasında.)
    public static boolean isCatPlaying(boolean isSummer, int temp) {
       int upperLimit = isSummer ? 45 : 35;
       return temp >= 25 && temp <= upperLimit;

    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
