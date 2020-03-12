package onstage;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import main.Main;



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
    
    MyJPanel mypanel = new MyJPanel();
    
    public MyJFrame(int w,int h){
    	System.out.println("Create a Class MyJFrame!");
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
        
        this.setLayout(new FlowLayout());
        this.add(menuBar);
        this.setContentPane(mypanel);
        
        setTitle("Fight Against Landlord");
		setSize(appW, appH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ر�ʱ�ͷ���Դ
        setLocationRelativeTo(null);
		setLocation(100, 100);
		setVisible(true);
    }
    
    public static void main(String[] args) { 
		System.out.println("Create a Class Main!");
		MyJFrame my = new MyJFrame(500,500);
	}
}
