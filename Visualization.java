import javax.swing.JFrame;import javax.swing.JPanel;import java.awt.Graphics;
import java.awt.Dimension;import java.util.Scanner;public class Visualization {    private static class MyPanel extends JPanel {        public MyPanel() {            super(true);
            this.setPreferredSize(new Dimension(800, 800));
            this.setMaximumSize(new Dimension(800, 800));
            this.setMinimumSize(new Dimension(800, 800));        }        public void paintComponent(Graphics g) {
            super.paintComponent(g);            Scanner k = new Scanner(System.in);            int numofLoops = k.nextInt();            int numofTris = k.nextInt();            int x[][] = new int[numofTris][3];            int y[][] = new int[numofTris][3];            for(int tri=0; tri<numofTris; tri++) {                for(int pt=0; pt<3; pt++) {                    x[tri][pt] = (int)((k.nextDouble()+1)*(800/2));                    y[tri][pt] = (int)((k.nextDouble()+1)*(800/2));                }            }            for(int i=0; i<numofTris; i++) {                g.drawPolygon(x[i], y[i], 3);            }
        }    }    public static MyPanel panel;    public static void main(String args[]) {        panel = new MyPanel();        JFrame frame = new JFrame("xx3DGraphics");
        frame.setSize(800, 800);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();        panel.repaint();    }}