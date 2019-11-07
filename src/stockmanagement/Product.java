/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Product {

    public int id, perPrice, amount, ExpDate;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String name, variety;

    public Scanner sn = new Scanner(System.in);

    public ArrayList productBrands = new ArrayList();
    public ArrayList ids = new ArrayList();
    public ArrayList productVarieties = new ArrayList();
    public ArrayList ExpDates = new ArrayList();
    public ArrayList perPrices = new ArrayList();
    public ArrayList stockAmount = new ArrayList();

    public Product() {

    }

    public void Sell(int id) {
        System.out.println("Satışını Yapmak Istediğiniz Ürünün Id'sini Giriniz:");
        int sellId = sn.nextInt();
        int sellIndex = ids.indexOf(silId);
        System.out.println("Kaç Adet Satılacak?");
        int sellAmount = sn.nextInt();
        this.stockAmount.set(sellId, stockAmount.get(sellId)+sellAmount);
    }

    public void DeleteProduct() {
        System.out.println("Silmek İstediğiniz ürünün ID'sini Giriniz: ");
        int silId = sn.nextInt();
        int silIndex = ids.indexOf(silId);

        this.ids.remove(silIndex);
        this.productBrands.remove(silIndex);
        this.productVarieties.remove(silIndex);
        this.perPrices.remove(silIndex);
        this.ExpDates.remove(silIndex);
        this.stockAmount.remove(silIndex);
        System.out.println("Ürün Başarıyla Silindi...");

    }

    public void AddProducts(int id) {
        setId(id);
        //sn.nextLine();

        System.out.println("Ürünün Markasını Giriniz: ");
        setName(sn.nextLine());
        //sn.nextLine();
        System.out.println("Ürünün Türünü Giriniz: ");
        setVariety(sn.nextLine());
        System.out.println("Ürünün Tekil Fiyatını Giriniz: ");
        setPerPrice((sn.nextInt()));
        System.out.println("Ürünün Son Kullanma Tarihini Giriniz: ");
        setExpDate(sn.nextInt());
        System.out.println("Stok Adedi Giriniz: ");
        setAmount(sn.nextInt());

        this.ids.add(getId());
        this.productBrands.add(getName());
        this.productVarieties.add(getVariety());
        this.perPrices.add(getPerPrice());
        this.ExpDates.add(getExpDate());
        this.stockAmount.add(getAmount());

        System.out.println("Ürün Başarılıyla Eklendi!");
        System.out.println("Addproduct size" + this.ids.size());
    }

    public String getVariety() {
        return variety;
    }

    public void ShowProducts() {
        for (int i = 0; i < ids.size(); i++) {
            System.out.println((i + 1) + ". Urun Hakkında Bilgiler");
            System.out.println("ID'si: " + ids.get(i));
            System.out.println("Markası: " + productBrands.get(i));
            System.out.println("Türü: " + productVarieties.get(i));
            System.out.println("Tekil Fiyatı: " + perPrices.get(i));
            System.out.println("Son Kul. Tarihi: " + ExpDates.get(i));
            System.out.println("Stok Adedi: " + stockAmount.get(i));

        }
        System.out.println("Devam Etmek İçin Enter'a Basınız...");
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(int perPrice) {
        this.perPrice = perPrice;
    }

    static int Secenekler() {
        Scanner scan = new Scanner(System.in);
        System.out.println("[0] Ürün Ekle");
        System.out.println("[1] Ürün Listele");
        System.out.println("[2] Ürün Sil");
        /*System.out.println("Ürün Ekle/Çıkar");
        System.out.println("Ürün Ekle/Çıkar");
        System.out.println("Ürün Ekle/Çıkar");
        System.out.println("Ürün Ekle/Çıkar");*/
        int id = scan.nextInt();
        return id;
    }

    public int getExpDate() {
        return ExpDate;
    }

    public void setExpDate(int ExpDate) {
        this.ExpDate = ExpDate;
    }

    public ArrayList getPerPrices() {
        return perPrices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
