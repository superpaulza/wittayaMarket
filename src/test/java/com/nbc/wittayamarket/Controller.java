package com.nbc.wittayamarket;

import java.sql.*;

public class Controller {
    View view;
    Model model;
    private static Connection conn = null;
    private PreparedStatement pst = null;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
        view.SetControllerObj(this);
        model.SetViewObj(view);
        Connect_to_Base();
    }

    private void Connect_to_Base() {
        String urlConnect = "jdbc:ชื่อDatabase://ลิงค์เชื่อม DataBase";
        String url = "jdbc:sqlserver://DESKTOP-CN19JC6\\SQLEXPRESS;databaseName=Traning_MVC;user=sa;password=Nzeed0";

        String urlTest = "jdbc:home112.ddns.net:3306;databaseName=root;password=badguy6969";

        try {
            conn = DriverManager.getConnection(urlTest);
            System.out.println("Connect Successfully");
        } catch (SQLException e) {
            System.out.println("Error Detected");
            e.getMessage();
        }
    }

    private void InputToDatabase(){
        String sql_command = "INSERT INTO ชื่อTable values(Id,Name,OtherInformationColumn)";

        try{
            pst = conn.prepareStatement(sql_command);
            pst.executeUpdate();

        } catch(SQLException e){
            e.getMessage();
        }
    }
}
