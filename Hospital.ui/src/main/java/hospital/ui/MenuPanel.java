package hospital.ui;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {
    public static JPanel createMenuPanel(UIComponents app) {
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(59, 25, 25));
        menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(59, 25, 25));

        JMenu menu = new JMenu("MENU");
        menu.setForeground(Color.WHITE);
        menu.setFont(new Font("Arial", Font.BOLD, 16));

        // Manually adding each menu item
        JMenuItem homeItem = new JMenuItem("Home");
        homeItem.setFont(new Font("Arial", Font.PLAIN, 16));
        homeItem.setForeground(Color.WHITE);
        homeItem.setBackground(new Color(59, 25, 25));
        homeItem.setPreferredSize(new Dimension(180, 40));
        homeItem.setMargin(new Insets(10, 20, 10, 20));
        homeItem.addActionListener(e -> app.switchPanel("Home"));
        menu.add(homeItem);

        JMenuItem patientItem = new JMenuItem("Patient");
        patientItem.setFont(new Font("Arial", Font.PLAIN, 16));
        patientItem.setForeground(Color.WHITE);
        patientItem.setBackground(new Color(59, 25, 25));
        patientItem.setPreferredSize(new Dimension(180, 40));
        patientItem.setMargin(new Insets(10, 20, 10, 20));
        patientItem.addActionListener(e -> app.switchPanel("Patient"));
        menu.add(patientItem);

        JMenuItem doctorItem = new JMenuItem("Doctor");
        doctorItem.setFont(new Font("Arial", Font.PLAIN, 16));
        doctorItem.setForeground(Color.WHITE);
        doctorItem.setBackground(new Color(59, 25, 25));
        doctorItem.setPreferredSize(new Dimension(180, 40));
        doctorItem.setMargin(new Insets(10, 20, 10, 20));
        doctorItem.addActionListener(e -> app.switchPanel("Doctor"));
        menu.add(doctorItem);

        JMenuItem appointmentItem = new JMenuItem("Appointment");
        appointmentItem.setFont(new Font("Arial", Font.PLAIN, 16));
        appointmentItem.setForeground(Color.WHITE);
        appointmentItem.setBackground(new Color(59, 25, 25));
        appointmentItem.setPreferredSize(new Dimension(180, 40));
        appointmentItem.setMargin(new Insets(10, 20, 10, 20));
        appointmentItem.addActionListener(e -> app.switchPanel("Appointment"));
        menu.add(appointmentItem);

        JMenuItem viewItem = new JMenuItem("View");
        viewItem.setFont(new Font("Arial", Font.PLAIN, 16));
        viewItem.setForeground(Color.WHITE);
        viewItem.setBackground(new Color(59, 25, 25));
        viewItem.setPreferredSize(new Dimension(180, 40));
        viewItem.setMargin(new Insets(10, 20, 10, 20));
        viewItem.addActionListener(e -> app.switchPanel("View"));
        menu.add(viewItem);

        menuBar.add(menu);
        menuPanel.add(menuBar);
        return menuPanel;
    }
}
