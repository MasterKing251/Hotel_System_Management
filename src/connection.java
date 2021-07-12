/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velly King Jasper O. Marcellones
 */
public class connection {
    String user;
    String url;
    String password;
    
    public void connectDB(){
        user = "root";
        url = "jdbc:mysql://localhost:3306/project1_hotel_system";
        password = "";
    }

}
