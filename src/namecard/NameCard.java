/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namecard;

import java.io.Serializable;

/**
 *
 * @author hieuh
 */
public class NameCard implements Serializable{

    @Override
    public String toString() {
        return "NameCard{" + "name=" + name + ", address=" + address + ", img=" + img + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getImg() {
        return img;
    }

    public NameCard() {
    }

    public NameCard(String name, String address, String img) {
        this.name = name;
        this.address = address;
        this.img = img;
    }
   private String name;
   private String address;
   private String img;
   
   
}
