package javalab2;

//public class DullShipTable {
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class DullShipTable {
    public static void main(String[] args) {
        // create some tabular data
        String[] headings =
                new String[] {"Number", "Hot?", "Origin",
                        "Destination", "Ship Date", "Weight" };
        Object[][] data = new Object[][] {
                { "100420", Boolean.FALSE, "Des Moines IA", "Spokane WA",
                        "02/06/2000", new Float(450) },
                { "202174", Boolean.TRUE, "Basking Ridge NJ", "Princeton NJ",
                        "05/20/2000", new Float(1250) },
                { "450877", Boolean.TRUE, "St. Paul MN", "Austin TX",
                        "03/20/2000", new Float(1745) },
                { "101891", Boolean.FALSE, "Boston MA", "Albany NY",
                        "04/04/2000", new Float(88) }
        };

        // create the data model and the JTable
        JTable table = new JTable(data, headings);

        JFrame frame = new JFrame("Table");
        frame.add(new JScrollPane(table));

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(500, 200);
        frame.setVisible(true);
//        frame.setForeground(Color.BLUE);
//        frame.setBackground(Color.BLUE);
        ;
    }
}