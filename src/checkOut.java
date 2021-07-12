/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velly King Jasper O. Marcellones
 */
public class checkOut {
    int[] roomPrice = {1000,2000,3000};
    String roomType;
    int price,days,payment;
    
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    
    public void setPrice(){
        if (roomType.equals("Single")){
            price = roomPrice[0];
        }
        else if(roomType.equals("Double")){
            price = roomPrice[1];
        }
        else if (roomType.equals("Family")){
            price = roomPrice[2];
        }
    }
    public void setDays(int days){
        this.days = days;
    }
    public int calDays(){
        payment = days * price;
        return payment;
    }
}
