package hospital.ui;
import javax.swing.*;
import java.awt.*;

public class UIComponents {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JFrame mainFrame;

    public UIComponents() {
        mainFrame = new JFrame("Hospital Management System");
        mainFrame.setSize(600, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.setLayout(new BorderLayout());

        JPanel menuPanel = MenuPanel.createMenuPanel(this);
        mainFrame.add(menuPanel, BorderLayout.NORTH);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        cardPanel.add(Panels.createHomePanel(), "Home");
        cardPanel.add(Panels.createPatientPanel(), "Patient");
        cardPanel.add(Panels.createDoctorPanel(), "Doctor");
        cardPanel.add(Panels.createAppointmentPanel(), "Appointment");
        cardPanel.add(Panels.createViewPanel(), "View");

        mainFrame.add(cardPanel, BorderLayout.CENTER);
        cardLayout.show(cardPanel, "Home");
        mainFrame.setVisible(true);
    }

    public void switchPanel(String panelName) {
        cardLayout.show(cardPanel, panelName);
    }
}
