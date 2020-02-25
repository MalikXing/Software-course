package main;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyJFrame extends JFrame{
	private int appW, appH; // ������ڵĳ���
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("�ļ�");
    JMenu editMenu = new JMenu("�༭");
    JMenu viewMenu = new JMenu("��ͼ");
    JMenu aboutMenu = new JMenu("����");
    
    JMenuItem newMenuItem = new JMenuItem("�½�");
    JMenuItem openMenuItem = new JMenuItem("��");
    JMenuItem exitMenuItem = new JMenuItem("�˳�");
    
    MyJFrame(int w,int h){
    	this.appW=w; this.appH = h;
		
//		jframe.getContentPane().add(this); // JFrame�������
		
    	// JMenuBar
		menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(aboutMenu);
        
        //JMenu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator();       // ���һ���ָ���
        fileMenu.add(exitMenuItem);
        
        this.add(menuBar);
        
        setTitle("Fight Against Landlord");
		setSize(appW, appH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ر�ʱ�ͷ���Դ
		setLocation(100, 100);
		setVisible(true);
    }
}
