package org.nooblabs;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.apache.commons.io.FileUtils;

class FileDownloader{
    static void init(String fileUrl, String fileName, String fileSaveLocation){


        try{
            URL url = new URL(fileUrl);
            try(ReadableByteChannel rbc = Channels.newChannel(url.openStream());
            FileOutputStream fos = new FileOutputStream(fileSaveLocation + "/" + fileName)){
                FileUtils.copyURLToFile(url, new File(fileSaveLocation + "/" + fileName));
                return;
                // long s = 0;
                // FileChannel chnl = fos.getChannel();
                // long bytesRead = chnl.transferFrom(rbc, s, 14000L);
                // while(bytesRead > 0){
                //     System.out.println("Bytes read: " + bytesRead);
                //     s = bytesRead;
                //     bytesRead = chnl.transferFrom(rbc, s, 14000L);
                // }
            }
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
    }
}