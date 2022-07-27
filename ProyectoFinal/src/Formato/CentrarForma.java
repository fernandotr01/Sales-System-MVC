package Formato;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;


public class CentrarForma {
    public static void CPanel(JDesktopPane pan,JInternalFrame inf){
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width)/2,            
                (desktopSize.height - jifSize.height)/2-80);
    }
}

