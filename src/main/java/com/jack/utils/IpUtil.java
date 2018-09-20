package com.jack.utils;

import org.apache.log4j.Logger;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class IpUtil {

    private static Logger logger = Logger.getLogger(IpUtil.class);

    /**
     * 获取本机IP地址
     *
     * @return IP地址
     */
    public static String getLocalIP() {
        try {
            Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip;
            while (allNetInterfaces.hasMoreElements())
            {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                Enumeration addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements())
                {
                    ip = (InetAddress) addresses.nextElement();
                    if (ip != null && ip instanceof Inet4Address)
                    {
                        String hostAddress = ip.getHostAddress();
                        if (hostAddress != null && ! hostAddress.equals("127.0.0.1"))
                            return ip.getHostAddress();
                    }
                }
            }
        } catch (Exception e) {
            logger.error("getLocalIP", e);
        }

        return "127.0.0.1";
    }

}
