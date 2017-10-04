package com.snail.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 上传文件到FTP服务器的工具类
 *
 * Created by panyuanyuan on 2017/7/1.
 */
public class FTPUtil {

    /** 声明打印日志 */
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private static final Integer FTP_PORT = 21;
    private static final String FTP_IP = PropertiesUtil.getProperty("ftp.server.ip");
    private static final String FTP_USERNAME = PropertiesUtil.getProperty("ftp.user");
    private static final String FTP_PASSWORD = PropertiesUtil.getProperty("ftp.pass");

    private String ip;
    private int port;
    private String user;
    private String password;
    private FTPClient ftpClient;

    public FTPUtil(String ip, int port, String user, String password) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    /**
     * 上传文件到FTP服务器接口
     *
     * @param files
     * @return
     */
    public static boolean uploadFile(List<File> files) {
        FTPUtil ftpUtil = new FTPUtil(FTP_IP, FTP_PORT, FTP_USERNAME, FTP_PASSWORD);
        boolean result = ftpUtil.uploadFile("image", files);
        return  result;
    }


    /**uploadFile
     * FTP上传文件
     *
     * @param remotePath
     * @param fileList
     * @return
     */
    private boolean uploadFile(String remotePath, List<File> fileList) {
        boolean uploaded = true;
        FileInputStream fis = null;

        //链接FTP服务器上传文件
        if(connectServer(ip, user, password)) {
            try {
                ftpClient.changeWorkingDirectory(remotePath);
                ftpClient.setBufferSize(1024 * 8);
                ftpClient.setControlEncoding("UTF-8");
                ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();

                for(File fileItem : fileList) {
                    fis = new FileInputStream(fileItem);
                    ftpClient.storeFile(fileItem.getName(), fis);
                }

            } catch (IOException e) {
                logger.error("change ftp remote err");
                uploaded = false;
            } finally {
                try {
                    fis.close();
                    ftpClient.disconnect();
                } catch (IOException e) {
                    logger.error("close stream err");
                }
            }
        }

        return uploaded;
    }

    /**
     * 链接FTP服务器
     *
     * @param ip
     * @param user
     * @param password
     * @return
     */
    private boolean connectServer(String ip, String user, String password) {

        boolean connectSuccess = false;
        ftpClient = new FTPClient();
        try {
            ftpClient.connect(ip);
            connectSuccess = ftpClient.login(user, password);
        } catch (IOException e) {
            logger.error("connect ftp server err");
        }

        return connectSuccess;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswprd() {
        return password;
    }

    public void setPasswprd(String password) {
        this.password = password;
    }

    public FTPClient getFtpClient() {
        return ftpClient;
    }

    public void setFtpClient(FTPClient ftpClient) {
        this.ftpClient = ftpClient;
    }
}
