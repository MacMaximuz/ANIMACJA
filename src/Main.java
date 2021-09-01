import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


// praca domowa grubsze olimpijskie
///
// jak zrealizowac mechanizm animacji
// animacje


//zmienialo kolor
//po skosach
//5 pilek i latanie 
//



//4 pilki od siebie odbijaja
//mouselistener
//keylistener




class MyJPanel extends JPanel implements ActionListener{
    Timer timer;
    int minimum=0;
    int maxim=800;
    int x1=(int)Math.floor(Math.random()*(maxim-minimum+1)+minimum);
    int y1=(int)Math.floor(Math.random()*(maxim-minimum+1)+minimum);
    int x1_przemieszczenie=1;
    int y1_przemieszczenie=1;
    int x2=(int)Math.floor(Math.random()*(maxim-minimum+1)+minimum);
    int y2=(int)Math.floor(Math.random()*(maxim-minimum+1)+minimum);
    int x2_przemieszczenie=1;
    int y2_przemieszczenie=1;
    int x3=(int)Math.floor(Math.random()*(maxim-minimum+1)+minimum);
    int y3=(int)Math.floor(Math.random()*(maxim-minimum+1)+minimum);
    int x3_przemieszczenie=1;
    int y3_przemieszczenie=1;
    int okno_wysokosc=1000;
    int predkosc1=1;
    int min=100;
    int max=400;
    int random = (int)Math.floor(Math.random()*(max-min+1)+min);
    int random2 = (int)Math.floor(Math.random()*(max-min+1)+min);
    int random3 = (int)Math.floor(Math.random()*(max-min+1)+min);

   /* Map<Integer, Integer> Kolka = new HashMap<>();

        Kolka.put(300,150);
        Kolka.put(0,0);
        Kolka.put(700,300);
        Kolka.put(600,200);

    java.util.List<Integer> lista_X = new ArrayList<>(Kolka.keySet());
    java.util.List<Integer> lista_Y = new ArrayList<>(Kolka.values()); */

    public MyJPanel() {

        timer = new Timer( 1,this);
        timer.start();
    }


    Color p1;
    Color p2;
    Color p3;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(okno_wysokosc, okno_wysokosc);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        //int r = ThreadLocalRandom.current().nextInt();
        Graphics2D g2 = (Graphics2D) g;//grafika 2D

        /*g2.setStroke(new BasicStroke(10));//ustawianie grubosci
        g2.setColor(p1);
        g2.drawOval(x1, y1, 100, 100);
        g2.setStroke(new BasicStroke(10));//ustawianie grubosci
        g2.setColor(p2);
        g2.drawOval(x2, y2, 100, 100);
        g2.setStroke(new BasicStroke(10));//ustawianie grubosci
        g2.setColor(p3);
        g2.drawOval(x3, y3, 100, 100);
*/

            if (random <= 100) {
                g2.setStroke(new BasicStroke(10));//ustawianie grubosci
                g2.setColor(p1);
                g2.drawOval(x1, y1, 100, 100);
            }
            if (random <= 200 && random >= 101)
            {
                g2.setStroke(new BasicStroke(10));//ustawianie grubosci
                g2.setColor(p1);
                g2.fillOval(x1, y1, 100, 100);
            }
            if (random <= 300 && random >= 201) {
                g2.setStroke(new BasicStroke(10));//ustawianie grubosci
                g2.setColor(p1);
                g2.drawRect(x1, y1, 100, 100);
            }
            if (random <= 400 && random >= 301) {
                g2.setStroke(new BasicStroke(10));//ustawianie grubosci
                g2.setColor(p1);
                g2.fillRect(x1, y1, 100, 100);
            }
        if (random2 <= 100) {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p3);
            g2.fillOval(x3, y3, 100, 100);
        }
        if (random2 <= 200 && random2 >= 101)
        {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p3);
            g2.drawOval(x3, y3, 100, 100);
        }
        if (random2 <= 300 && random2 >= 201) {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p3);
            g2.fillRect(x3, y3, 100, 100);
        }
        if (random2 <= 400 && random2 >= 301) {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p3);
            g2.drawRect(x3, y3, 100, 100);
        }
        if (random3 <= 100) {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p2);
            g2.drawRect(x2, y2, 100, 100);
        }
        if (random3 <= 200 && random3 >= 101)
        {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p2);
            g2.fillRect(x2, y2, 100, 100);
        }
        if (random3 <= 300 && random3 >= 201) {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p2);
            g2.drawOval(x2, y2, 100, 100);
        }
        if (random3 <= 400 && random3 >= 301) {

            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(p2);
            g2.fillOval(x2, y2, 100, 100);
        }



        /*for (int i=0;i<Kolka.size();i++)
        {
            g2.setStroke(new BasicStroke(10));//ustawianie grubosci
            g2.setColor(c);
            g2.drawOval(lista_X.get(i), lista_Y.get(i), 100, 100);
        }*/
    }


    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void actionPerformed(ActionEvent e) //zalezy od timera co tyle zostanie nadpisane
    {

        int r=getRandomNumber(10,200);
        int gg=getRandomNumber(10,200);
        int b=getRandomNumber(10,200);


        if (x1 + x1_przemieszczenie < 0)
        {
            x1_przemieszczenie=1;
            p1 = new Color(r,gg,b);
        }
        else if (x1+x1_przemieszczenie > getWidth()-100)
        {
            x1_przemieszczenie=-1-1;
            p1 = new Color(r,gg,b);
        }
        if (y1 + y1_przemieszczenie < 0) {
            y1_przemieszczenie=1;
            p1 = new Color(r,gg,b);
        }
        else if (y1+y1_przemieszczenie > getHeight()-100)
        {
            y1_przemieszczenie=-1;
            p1 = new Color(r,gg,b);
        }
        //2
        if (x2 + x2_przemieszczenie < 0)
        {
            x2_przemieszczenie=1;
            p2 = new Color(r,gg,b);
        }
        else if (x2+x2_przemieszczenie > getWidth()-100)
        {
            x2_przemieszczenie=-1-1;
            p2  = new Color(r,gg,b);
        }
        if (y2 + y2_przemieszczenie < 0) {
            y2_przemieszczenie=1;
            p2  = new Color(r,gg,b);
        }
        else if (y2+y2_przemieszczenie > getHeight()-100)
        {
            y2_przemieszczenie=-1;
            p2  = new Color(r,gg,b);
        }
        //3
        if (x3 + x3_przemieszczenie < 0)
        {
            x3_przemieszczenie=1;
            p3 = new Color(r,gg,b);
        }
        else if (x3+x3_przemieszczenie > getWidth()-100)
        {
            x3_przemieszczenie=-1-1;
            p3 = new Color(r,gg,b);
        }
        if (y3 + y3_przemieszczenie < 0) {
            y3_przemieszczenie=1;
            p3 = new Color(r,gg,b);
        }
        else if (y3+y3_przemieszczenie > getHeight()-100)
        {
            y3_przemieszczenie=-1;
            p3 = new Color(r,gg,b);
        }


        x1 = x1 + x1_przemieszczenie+1; //przemieszczenie
        y1 = y1 + y1_przemieszczenie;

        x2= x2 + x2_przemieszczenie+1; //przemieszczenie
        y2 = y2 + y2_przemieszczenie;

        x3= x3 + x3_przemieszczenie+1; //przemieszczenie
        y3 = y3 + y3_przemieszczenie;

            repaint(); //odswiezanie


    }
}

    public class Main {

        public static void main(String[] args) {



            MyJPanel myp = new MyJPanel();

            EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {

                    Timer timer;
                    JFrame window = new JFrame();
                    window.setVisible(true);
                    window.setTitle("Moje okno do rysowania");
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    window.add(myp);
                    window.pack();
                }
            });

        }
    }


    /*if (x>=okno_wysokosc-100 && y>=okno_wysokosc-100)  {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            y_przemieszczenie=y_przemieszczenie*-1;
            int r=getRandomNumber(10,200);
            int gg=getRandomNumber(10,200);
            int b=getRandomNumber(10,200);
            c = new Color(r,gg,b);
        }
        if (x>=okno_wysokosc-100 ) //za prawo
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            //y_przemieszczenie=y_przemieszczenie*-1;

        }
        if (y>=okno_wysokosc-100 )
        {
            //x_przemieszczenie=x_przemieszczenie*-1-1;
            y_przemieszczenie=y_przemieszczenie*-1;

        }
        if (y<0 ) //za prawo
        {
            y_przemieszczenie=y_przemieszczenie*-1;


        }
        if (x<0 ) //za prawo
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;


        }
        if (x<=okno_wysokosc-100 && y>= okno_wysokosc-100) //za prawo
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            //y_przemieszczenie=y_przemieszczenie*-1;


        } */



    /*if (x>=okno_wysokosc-100 && y>=okno_wysokosc-100)  {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            y_przemieszczenie=y_przemieszczenie*-1;
            int r=getRandomNumber(10,200);
            int gg=getRandomNumber(10,200);
            int b=getRandomNumber(10,200);
            c = new Color(r,gg,b);
        }
        else if (x>=okno_wysokosc-100 || (x>okno_wysokosc-100 && y==0-100) ) //za prawo
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            //y_przemieszczenie=y_przemieszczenie*-1;
            c = Color.yellow;

        }
        else if (y>=okno_wysokosc-100 )
        {
            //x_przemieszczenie=x_przemieszczenie*-1-1;
            y_przemieszczenie=y_przemieszczenie*-1;
            c = Color.blue;
        }
        else if (y<0 )
        {
            y_przemieszczenie=y_przemieszczenie*-1;
            c = Color.green;

        }
        else if (x<0 )
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            c = Color.orange;

        }
        if (x + x_przemieszczenie < 0) {
        x_przemieszczenie=1;
        }
        else if (x+x_przemieszczenie > getWidth()-100)
        {
        x_przemieszczenie=-1-1;
        }
        if (y + y_przemieszczenie < 0) {
        y_przemieszczenie=1;
        }
        else if (y+y_przemieszczenie > getHeight()-100)
        {
        y_przemieszczenie=-1;
        }
        if (x>=okno_wysokosc-100 && y==0)
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;
           // y_przemieszczenie=y_przemieszczenie*-1;
        }
        /*if (x<=okno_wysokosc-100 && y>= okno_wysokosc-100) //za prawo
        {
            x_przemieszczenie=x_przemieszczenie*-1-1;
            //y_przemieszczenie=y_przemieszczenie*-1;


        }
        /*if (y<=okno_wysokosc-100 && x>= okno_wysokosc-100) //wywala sie na kancie na dole
        {
            //x_przemieszczenie=x_przemieszczenie*-1-1;
            y_przemieszczenie=y_przemieszczenie*-1;


        } */