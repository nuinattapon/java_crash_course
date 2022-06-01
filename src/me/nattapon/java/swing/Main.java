package me.nattapon.java.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Enable anti-aliasing
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

        setDarkTheme();
        // Show your JFrame
        JFrame frame = new MyJFrame();

        frame.setVisible(true);
    }

    private static void setDarkTheme() {
        UIManager.put("control", new Color(128, 128, 128));
        UIManager.put("info", new Color(128, 128, 128));
        UIManager.put("nimbusBase", new Color(18, 30, 49));
        UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
        UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
        UIManager.put("nimbusFocus", new Color(115, 164, 209));
        UIManager.put("nimbusGreen", new Color(176, 179, 50));
        UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
        UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
        UIManager.put("nimbusOrange", new Color(191, 98, 4));
        UIManager.put("nimbusRed", new Color(169, 46, 34));
        UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
        UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
        UIManager.put("text", new Color(230, 230, 230));

        int FONT_SIZE = 12;
        String FONT_FAMILY = "Tahoma";
        for (Map.Entry<Object, Object> entry : javax.swing.UIManager.getDefaults().entrySet()) {
            Object key = entry.getKey();
            Object value = javax.swing.UIManager.get(key);
            if (value != null && value instanceof javax.swing.plaf.FontUIResource) {
                javax.swing.plaf.FontUIResource fr = (javax.swing.plaf.FontUIResource) value;
//                javax.swing.plaf.FontUIResource f = new javax.swing.plaf.FontUIResource(new Font(FONT_FAMILY, fr.getStyle(), FONT_SIZE));
//                javax.swing.plaf.FontUIResource f = new javax.swing.plaf.FontUIResource(fr.getFamily(), fr.getStyle(), FONT_SIZE);
                javax.swing.plaf.FontUIResource f = new javax.swing.plaf.FontUIResource(FONT_FAMILY, fr.getStyle(), FONT_SIZE);
                javax.swing.UIManager.put(key, f);
            }
        }

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


//        System.out.println(javax.swing.UIManager.getLookAndFeel());
    }
}
