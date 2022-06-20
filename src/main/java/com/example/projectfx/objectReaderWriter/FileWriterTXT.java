package com.example.projectfx.objectReaderWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileWriterTXT {
    //        static Logger logger = LoggerFactory.getLogger(FileWriter.class);

    public void write(List flowers) throws IOException {
        File file = new File("resources/com.example.projectfx/fileWrite.txt");

        for(int i=0; i < flowers.size(); i++){
            Object o = flowers.get(i) ;
            if(i == 0){
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                try {
                    oos.writeObject(o);
                    oos.close();
                } catch (Exception ignore) {
                    ignore.printStackTrace();
                }
            }

            else{
                boolean isexist = false;
                if (file.exists()) {
                    isexist = true;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

                long pos = 0;
                if (isexist) {
                    pos = fileOutputStream.getChannel().position() - 4;
                    fileOutputStream.getChannel().truncate(pos);
//                    logger.info("Успешно добавлено");
                }
                oos.writeObject(o);
                oos.close();
            }

        }

    }
}
