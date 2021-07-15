/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velly King Jasper O. Marcellones
 */
public class roomNumber {
    
    int count;
    String roomNumber;
    String rType;
    int AddNum;
    String letter;
    public void setCount(int count){
        this.count= count;
    }
    public void setRType(String rType){
        this.rType = rType;
    }
    public void setAddNum(){
        if (rType.equals("Single")){
            AddNum = 1;
        }
        else if (rType.equals("Double")){
            AddNum = 21;
        }
        else if (rType.equals("Family")){
            AddNum = 41;
        }
    }
    public void Letter(){
        if (rType.equals("Single")){
            letter = "S-";
        }
        else if (rType.equals("Double")){
            letter = "D-";
        }
        else if (rType.equals("Family")){
            letter = "F-";
        }
    }
    public int sam(){
        return AddNum;
    }
    public int getCurrentRoomNum(){
        int all = 0;
        all = AddNum + count;
        return all++;
    }
    
  
}
