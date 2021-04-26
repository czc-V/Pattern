package adapter;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放mp3音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file . Name: "+fileName);
        }

        //通过适配器提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
                ||audioType.equalsIgnoreCase("mp4")
        ){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else{
            System.out.println("Invalid media."+ audioType+ "format not supported");
        }


    }
}
