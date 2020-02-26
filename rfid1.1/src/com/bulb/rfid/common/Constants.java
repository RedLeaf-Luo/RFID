package com.bulb.rfid.common;
 
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 系统常量定义类-全局变量
 * @ClassNmae：Constants
 * 
 * 
 * 
 */
public class Constants {
    /**
     * Socket相关
     */
    public static final String  over = "over";
    
    public static final int  port = 8123;
    
    public static final String  encode = "utf-8";
    
    public static  int socketCount = 0;
    
    public static List<Socket> socketList = new ArrayList<>();
}
