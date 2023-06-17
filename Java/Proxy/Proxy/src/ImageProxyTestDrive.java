import VirtualProxy.*;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class ImageProxyTestDrive {
    public static void main(String[] args) throws MalformedURLException {
        ImageComponent imageComponent = null;
        JFrame frame = new JFrame("Album Cover Viewer");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu();
        Hashtable<String, String> albums = new Hashtable<>();
        String initCover;

        /* 앨범 목록 설정 */
        setAlbum(albums);

        /* 임의로 앨범 사진 보여줄 값 설정 */
        ArrayList<String> coverList = new ArrayList<>() {
            {
                add("Buddha Bar"); add("LILAC"); add("폰서트");
                add("Ort Cloud");  add("Dancing With The Moonlight");
                add("Crazy");
            }
        };
        initCover = coverList.get(new Random().nextInt(coverList.size()));

        /* 객체 생성 및 데이터 입력
         * 프레임 및 메뉴 설정
         */
        setAlbumDataBinding(albums, initCover, menuBar, menu, frame, null);
    }
    public static void setAlbum(Hashtable<String, String> albums) {
        albums.put(
                "Buddha Bar"
                , "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg"
        );
        albums.put(
                "LILAC"
                , "https://pbs.twimg.com/profile_images/1374979417915547648/vKspl9Et_400x400.jpg"
        );
        albums.put(
                "폰서트"
                , "https://image.aladin.co.kr/product/23878/7/cover500/c962832577_1.jpg"
        );
        albums.put(
                "Ort Cloud"
                , "https://i.ytimg.com/vi/58IEh6YkuzQ/maxresdefault.jpg"
        );
        albums.put(
                "Dancing With The Moonlight"
                , "https://i.scdn.co/image/ab67616d0000b2735850b491b48900e6aac2b196"
        );
        albums.put(
                "Crazy"
                , "https://i.scdn.co/image/ab67616d0000b27361a13426a99fd3500e2fff54"
        );
    }


    public static void setAlbumDataBinding(
              Hashtable<String, String> albums
            , String getCover
            , JMenuBar jMenuBar
            , JMenu jMenu
            , JFrame jFrame
            , ImageComponent imageComponent) throws MalformedURLException {
        if (albums == null) { return; }

        String initLocation = albums.get(getCover);

        if (initLocation == null) { return ; }

        URL initialURL = new URL(initLocation);

        jMenuBar.add(jMenu);
        jFrame.setJMenuBar(jMenuBar);

        Icon icon = new ImageProxy(initialURL);
        if (imageComponent == null) { imageComponent = new ImageComponent(icon); }
        jFrame.getContentPane().add(imageComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);

        for(Enumeration e = albums.keys(); e.hasMoreElements();) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            jMenu.add(menuItem);

            ImageComponent finalImageComponent = imageComponent;
            menuItem.addActionListener(event -> {
                finalImageComponent.setIcon(
                        new ImageProxy(getAlbumUrl(event.getActionCommand(), albums))
                );
                jFrame.repaint();
            });
        }
    }

    public static URL getAlbumUrl(String name, Hashtable<String, String>albums) {
        try{
            return new URL(albums.get(name));
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
