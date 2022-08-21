import javax.swing.*;
import java.util.Objects;


public class App {
    private JPanel panel1;
    private JButton SearchButton;
    private JButton AddButton;
    private JButton RemoveButton;
    private JButton Exit;


    public App() {
        SearchButton.addActionListener(e -> {
            JDialog searchInformationDialog = new JDialog();
            searchInformationDialog.setVisible(true);
            searchInformationDialog.setSize(300, 200);

            JPanel informationPanel = new JPanel();
            informationPanel.setLayout(null);

            JButton search = new JButton("Search");
            JButton cancel = new JButton("Cancel");
            JTextField objectNameField = new JTextField();
            JLabel objectName = new JLabel("Name: -");
            JLabel header = new JLabel("Enter the details of the object: -");
            JLabel typeLabel = new JLabel("Type: -");
            String[] types = {"Asteroid", "Constellation", "Galaxy", "Planet", "Star"};

            JComboBox<String> typesList = new JComboBox<>(types);

            informationPanel.add(header);
            informationPanel.add(objectName);
            informationPanel.add(search);
            informationPanel.add(cancel);
            informationPanel.add(objectNameField);
            informationPanel.add(typeLabel);
            informationPanel.add(typesList);

            typesList.setBounds(150, 30, 100, 25);
            typeLabel.setBounds(50, 30, 100, 25);
            header.setBounds(20, 0 , 200, 25);
            objectNameField.setBounds(150, 70, 100, 25 );
            objectName.setBounds(50, 70, 100, 25 );
            search.setBounds(30, 120, 100, 25);
            cancel.setBounds(150, 120, 100, 25);

            searchInformationDialog.add(informationPanel);

            cancel.addActionListener(e1 -> searchInformationDialog.setVisible(false));

            search.addActionListener(e12 -> {
                String type = (String)typesList.getSelectedItem();
                String nameOfObject = objectNameField.getText();
                if(nameOfObject != null){
                    JDialog displaySearchResults = new JDialog();
                    displaySearchResults.setSize(300, 300);
                    displaySearchResults.setVisible(true);

                    JPanel dialogPanel = new JPanel();
                    dialogPanel.setLayout(null);
                    if("Planet".equals(type)){
                        JLabel heading = new JLabel("Object Information: -");
                        JLabel nameLabel = new JLabel("Name: -");
                        JLabel sizeLabel = new JLabel("Size: -");
                        JLabel typeLabel1 = new JLabel("Type: -");
                        JLabel infoLabel = new JLabel("Information: -");
                        JTextField nameTextField = new JTextField();
                        JTextField sizeTextField = new JTextField();
                        JTextField typeTextField = new JTextField();
                        JTextArea infoTextArea = new JTextArea();
                        JButton exit = new JButton("Exit");

                        dialogPanel.add(heading);
                        dialogPanel.add(nameLabel);
                        dialogPanel.add(sizeLabel);
                        dialogPanel.add(typeLabel1);
                        dialogPanel.add(infoLabel);
                        dialogPanel.add(nameTextField);
                        dialogPanel.add(sizeTextField);
                        dialogPanel.add(typeTextField);
                        dialogPanel.add(infoTextArea);
                        dialogPanel.add(exit);

                        heading.setBounds(90, 0, 250, 50);
                        nameLabel.setBounds(10, 50, 50,20);
                        sizeLabel.setBounds(10, 70, 100, 20 );
                        typeLabel1.setBounds(10, 90, 50 , 20);
                        infoLabel.setBounds(10, 110, 100 , 20);
                        nameTextField.setBounds(110, 50, 150, 20);
                        sizeTextField.setBounds(110, 70, 150, 20);
                        typeTextField.setBounds(110, 90, 150, 20);
                        infoTextArea.setBounds(110, 110, 150, 100);
                        exit.setBounds(90, 220, 100, 30);
                        nameTextField.setFocusable(false);
                        sizeTextField.setFocusable(false);
                        typeTextField.setFocusable(false);
                        infoTextArea.setFocusable(false);
                        infoTextArea.setWrapStyleWord(true);
                        infoTextArea.setLineWrap(true);
                        displaySearchResults.add(dialogPanel);

                        Planets planet = new Planets();
                        planet.setName(nameOfObject);
                        if(planet.objectExists(planet.getName())){
                            nameTextField.setText(nameOfObject);
                            sizeTextField.setText("" + planet.getSize());
                            typeTextField.setText(planet.getType());
                            infoTextArea.append(planet.getInformation());
                        }
                        else{
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        }

                        exit.addActionListener(e121 -> {
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        });
                    }

                    else if("Asteroid".equals(type)){
                        JLabel heading = new JLabel("Object Information: -");
                        JLabel nameLabel = new JLabel("Name: -");
                        JLabel sizeLabel = new JLabel("Size: -");
                        JLabel orbitalPeriodLabel = new JLabel("Orbital Period: -");
                        JLabel typeLabel1 = new JLabel("Type: -");
                        JLabel infoLabel = new JLabel("Information: -");
                        JTextField nameTextField = new JTextField();
                        JTextField sizeTextField = new JTextField();
                        JTextField orbitalPeriodTextField = new JTextField();
                        JTextField typeTextField = new JTextField();
                        JTextArea infoTextArea = new JTextArea();
                        JButton exit = new JButton("Exit");

                        dialogPanel.add(heading);
                        dialogPanel.add(nameLabel);
                        dialogPanel.add(sizeLabel);
                        dialogPanel.add(typeLabel1);
                        dialogPanel.add(orbitalPeriodLabel);
                        dialogPanel.add(infoLabel);
                        dialogPanel.add(nameTextField);
                        dialogPanel.add(sizeTextField);
                        dialogPanel.add(orbitalPeriodTextField);
                        dialogPanel.add(typeTextField);
                        dialogPanel.add(infoTextArea);
                        dialogPanel.add(exit);

                        heading.setBounds(90, 0, 250, 50);
                        nameLabel.setBounds(10, 50, 50,20);
                        sizeLabel.setBounds(10, 70, 100, 20 );
                        orbitalPeriodLabel.setBounds(10, 90, 100, 20 );
                        typeLabel1.setBounds(10, 110, 50 , 20);
                        infoLabel.setBounds(10, 130, 100 , 20);
                        nameTextField.setBounds(130, 50, 150, 20);
                        sizeTextField.setBounds(130, 70, 150, 20);
                        orbitalPeriodTextField.setBounds(130, 90, 150, 20);
                        typeTextField.setBounds(130, 110, 150, 20);
                        infoTextArea.setBounds(130, 130, 150, 100);
                        exit.setBounds(90, 270, 100, 30);
                        nameTextField.setFocusable(false);
                        sizeTextField.setFocusable(false);
                        orbitalPeriodTextField.setFocusable(false);
                        typeTextField.setFocusable(false);
                        infoTextArea.setFocusable(false);
                        infoTextArea.setWrapStyleWord(true);
                        infoTextArea.setLineWrap(true);
                        displaySearchResults.add(dialogPanel);

                        Asteroids asteroid = new Asteroids();
                        asteroid.setName(nameOfObject);
                        if(asteroid.objectExists(asteroid.getName())) {
                            nameTextField.setText(nameOfObject);
                            sizeTextField.setText("" + asteroid.getSize());
                            orbitalPeriodTextField.setText("" + asteroid.getOrbitalPeriod());
                            typeTextField.setText(asteroid.getType());
                            infoTextArea.append(asteroid.getInformation());
                        }
                        else{
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        }
                        exit.addActionListener(e1212 -> {
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        });
                    }

                    else if("Constellation".equals(type)) {
                        JLabel heading = new JLabel("Object Information: -");
                        JLabel nameLabel = new JLabel("Name: -");
                        JLabel numberOfStarsLabel = new JLabel("NumberOfStars: -");
                        JLabel typeLabel1 = new JLabel("Type: -");
                        JLabel infoLabel = new JLabel("Information: -");
                        JTextField nameTextField = new JTextField();
                        JTextField numberOfStarsTextField = new JTextField();
                        JTextField typeTextField = new JTextField();
                        JTextArea infoTextArea = new JTextArea();
                        JButton exit = new JButton("Exit");

                        dialogPanel.add(heading);
                        dialogPanel.add(nameLabel);
                        dialogPanel.add(numberOfStarsLabel);
                        dialogPanel.add(typeLabel1);
                        dialogPanel.add(infoLabel);
                        dialogPanel.add(nameTextField);
                        dialogPanel.add(numberOfStarsTextField);
                        dialogPanel.add(typeTextField);
                        dialogPanel.add(infoTextArea);
                        dialogPanel.add(exit);

                        heading.setBounds(90, 0, 250, 50);
                        nameLabel.setBounds(10, 50, 50, 20);
                        numberOfStarsLabel.setBounds(10, 70, 100, 20);
                        typeLabel1.setBounds(10, 90, 50, 20);
                        infoLabel.setBounds(10, 110, 100, 20);
                        nameTextField.setBounds(110, 50, 150, 20);
                        numberOfStarsTextField.setBounds(110, 70, 150, 20);
                        typeTextField.setBounds(110, 90, 150, 20);
                        infoTextArea.setBounds(110, 110, 150, 100);
                        exit.setBounds(90, 220, 100, 30);
                        nameTextField.setFocusable(false);
                        numberOfStarsTextField.setFocusable(false);
                        typeTextField.setFocusable(false);
                        infoTextArea.setFocusable(false);
                        infoTextArea.setWrapStyleWord(true);
                        infoTextArea.setLineWrap(true);
                        displaySearchResults.add(dialogPanel);

                        Constellations constellation = new Constellations();
                        constellation.setName(nameOfObject);
                        if(constellation.objectExists(constellation.getName())) {
                            nameTextField.setText(nameOfObject);
                            numberOfStarsTextField.setText("" + constellation.getNumberOfStars());
                            typeTextField.setText(constellation.getType());
                            infoTextArea.append(constellation.getInformation());
                        }
                        else{
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        }
                        exit.addActionListener(e1213 -> {
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        });
                    }
                    else if("Galaxy".equals(type)) {
                        JLabel heading = new JLabel("Object Information: -");
                        JLabel nameLabel = new JLabel("Name: -");
                        JLabel distanceLabel = new JLabel("Distance: -");
                        JLabel typeLabel1 = new JLabel("Type: -");
                        JLabel infoLabel = new JLabel("Information: -");
                        JTextField nameTextField = new JTextField();
                        JTextField distanceTextField = new JTextField();
                        JTextField typeTextField = new JTextField();
                        JTextArea infoTextArea = new JTextArea();
                        JButton exit = new JButton("Exit");

                        dialogPanel.add(heading);
                        dialogPanel.add(nameLabel);
                        dialogPanel.add(distanceLabel);
                        dialogPanel.add(typeLabel1);
                        dialogPanel.add(infoLabel);
                        dialogPanel.add(nameTextField);
                        dialogPanel.add(distanceTextField);
                        dialogPanel.add(typeTextField);
                        dialogPanel.add(infoTextArea);
                        dialogPanel.add(exit);

                        heading.setBounds(90, 0, 250, 50);
                        nameLabel.setBounds(10, 50, 50, 20);
                        distanceLabel.setBounds(10, 70, 100, 20);
                        typeLabel1.setBounds(10, 90, 50, 20);
                        infoLabel.setBounds(10, 110, 100, 20);
                        nameTextField.setBounds(110, 50, 150, 20);
                        distanceTextField.setBounds(110, 70, 150, 20);
                        typeTextField.setBounds(110, 90, 150, 20);
                        infoTextArea.setBounds(110, 110, 150, 100);
                        exit.setBounds(90, 220, 100, 30);
                        nameTextField.setFocusable(false);
                        distanceTextField.setFocusable(false);
                        typeTextField.setFocusable(false);
                        infoTextArea.setFocusable(false);
                        infoTextArea.setWrapStyleWord(true);
                        infoTextArea.setLineWrap(true);
                        displaySearchResults.add(dialogPanel);

                        Galaxies galaxy = new Galaxies();
                        galaxy.setName(nameOfObject);
                        if(galaxy.objectExists(galaxy.getName())){
                            nameTextField.setText(nameOfObject);
                            distanceTextField.setText("" + galaxy.getDistance());
                            typeTextField.setText(galaxy.getType());
                            infoTextArea.append(galaxy.getInformation());
                        }
                        else{
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        }
                        exit.addActionListener(e1214 -> {
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        });
                    }
                    else if("Star".equals(type)){
                        JLabel heading = new JLabel("Object Information: -");
                        JLabel nameLabel = new JLabel("Name: -");
                        JLabel distanceLabel = new JLabel("Distance: -");
                        JLabel massLabel = new JLabel("Mass: -");
                        JLabel sizeLabel = new JLabel("Size: -");
                        JLabel typeLabel1 = new JLabel("Type: -");
                        JLabel infoLabel = new JLabel("Information: -");
                        JTextField nameTextField = new JTextField();
                        JTextField distanceTextField = new JTextField();
                        JTextField sizeTextField = new JTextField();
                        JTextField massTextField = new JTextField();
                        JTextField typeTextField = new JTextField();
                        JTextArea infoTextArea = new JTextArea();
                        JButton exit = new JButton("Exit");

                        dialogPanel.add(heading);
                        dialogPanel.add(nameLabel);
                        dialogPanel.add(distanceLabel);
                        dialogPanel.add(typeLabel1);
                        dialogPanel.add(sizeLabel);
                        dialogPanel.add(massLabel);
                        dialogPanel.add(infoLabel);
                        dialogPanel.add(nameTextField);
                        dialogPanel.add(sizeTextField);
                        dialogPanel.add(massTextField);
                        dialogPanel.add(distanceTextField);
                        dialogPanel.add(typeTextField);
                        dialogPanel.add(infoTextArea);
                        dialogPanel.add(exit);

                        heading.setBounds(90, 0, 250, 50);
                        nameLabel.setBounds(10, 50, 50, 20);
                        distanceLabel.setBounds(10, 70, 100, 20);
                        massLabel.setBounds(10, 90, 100, 20);
                        sizeLabel.setBounds(10, 110, 100, 20);
                        typeLabel1.setBounds(10, 130, 50, 20);
                        infoLabel.setBounds(10, 150, 100, 20);
                        nameTextField.setBounds(110, 50, 150, 20);
                        distanceTextField.setBounds(110, 70, 150, 20);
                        massTextField.setBounds(110, 90, 150, 20);
                        sizeTextField.setBounds(110, 110, 150, 20);
                        typeTextField.setBounds(110, 130, 150, 20);
                        infoTextArea.setBounds(110, 150, 150, 140);
                        exit.setBounds(90, 300, 100, 30);
                        nameTextField.setFocusable(false);
                        distanceTextField.setFocusable(false);
                        sizeTextField.setFocusable(false);
                        massTextField.setFocusable(false);
                        typeTextField.setFocusable(false);
                        infoTextArea.setFocusable(false);
                        infoTextArea.setWrapStyleWord(true);
                        infoTextArea.setLineWrap(true);
                        displaySearchResults.add(dialogPanel);

                        Stars star = new Stars();
                        star.setName(nameOfObject);
                        if(star.objectExists(star.getName())) {
                            nameTextField.setText(nameOfObject);
                            distanceTextField.setText("" + star.getDistance());
                            sizeTextField.setText("" + star.getSize());
                            massTextField.setText("" + star.getMass());
                            typeTextField.setText(star.getType());
                            infoTextArea.append(star.getInformation());
                        }
                        else{
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        }
                        exit.addActionListener(e1215 -> {
                            displaySearchResults.setVisible(false);
                            searchInformationDialog.setVisible(false);
                        });
                    }

                }
            });
        });

        Exit.addActionListener(e -> System.exit(0));

        RemoveButton.addActionListener(e -> {
                JDialog informationDialog = new JDialog();
                informationDialog.setVisible(true);
                informationDialog.setSize(325, 300);
                JPanel dialogPanel = new JPanel();
                dialogPanel.setLayout(null);

                JButton confirm = new JButton("Confirm");
                JButton cancel = new JButton("Cancel");
                JLabel nameOfObject = new JLabel("Name of object:");
                JLabel heading = new JLabel("Enter the name of the object that you wish to delete");
                JLabel typesLabel = new JLabel("Type of object:");
                JTextField nameTextField = new JTextField();
                String[] types = {"Asteroid", "Constellation", "Galaxy", "Planet", "Star"};
                JComboBox<String> typesList = new JComboBox<>(types);

                dialogPanel.add(typesList);
                dialogPanel.add(typesLabel);
                dialogPanel.add(cancel);
                dialogPanel.add(confirm);
                dialogPanel.add(nameOfObject);
                dialogPanel.add(heading);
                dialogPanel.add(nameTextField);

                heading.setBounds(5, 50, 300, 25);
                nameTextField.setBounds(125, 85, 100, 25);
                nameOfObject.setBounds(30, 70, 100, 50);
                typesLabel.setBounds(30, 100, 100, 50);
                cancel.setBounds(150, 160, 90, 25);
                confirm.setBounds(45, 160, 90, 25);
                typesList.setBounds(130, 120, 90, 25);
                informationDialog.add(dialogPanel);


                cancel.addActionListener(e14 -> informationDialog.setVisible(false));
                confirm.addActionListener(e13 -> {
                    String type = (String)typesList.getSelectedItem();
                    String tableName = null;
                    switch (Objects.requireNonNull(type)) {
                        case "Galaxy" -> tableName = "galaxies";
                        case "Asteroid" -> tableName = "asteroids";
                        case "Star" -> tableName = "stars";
                        case "Constellation" -> tableName = "constellations";
                        case "Planet" -> tableName = "planets";
                        default -> System.out.println("Error");
                    }
                    String objectName = nameTextField.getText();

                    if("asteroids".equals(tableName)){
                        Asteroids asteroid = new Asteroids();
                        asteroid.setName(objectName);
                        if(asteroid.objectExists(asteroid.getName())){
                            int confirmation = JOptionPane.showConfirmDialog(null, "Do you really wish to delete " + objectName + "?");
                            if (confirmation == JOptionPane.YES_OPTION) {
                                SqlQueries delete = new SqlQueries("Delete from " + tableName + " where name = \"" + objectName + "\";");
                                delete.removeEntry();
                                informationDialog.setVisible(false);
                            } else if (confirmation == JOptionPane.NO_OPTION) {
                                informationDialog.setVisible(false);
                            }
                        }
                        else{
                            informationDialog.setVisible(false);
                        }
                    }
                    else if("galaxies".equals(tableName)){
                        Galaxies galaxy = new Galaxies();
                        galaxy.setName(objectName);
                        if(galaxy.objectExists(galaxy.getName())){
                            int confirmation = JOptionPane.showConfirmDialog(null, "Do you really wish to delete " + objectName + "?");
                            if (confirmation == JOptionPane.YES_OPTION) {
                                SqlQueries delete = new SqlQueries("Delete from " + tableName + " where name = \"" + objectName + "\";");
                                delete.removeEntry();
                                informationDialog.setVisible(false);
                            } else if (confirmation == JOptionPane.NO_OPTION) {
                                informationDialog.setVisible(false);
                            }
                        }
                        else{
                            informationDialog.setVisible(false);
                        }
                    }
                    else if("stars".equals(tableName)){
                        Stars star = new Stars();
                        star.setName(objectName);
                        if(star.objectExists(star.getName())){
                            int confirmation = JOptionPane.showConfirmDialog(null, "Do you really wish to delete " + objectName + "?");
                            if (confirmation == JOptionPane.YES_OPTION) {
                                SqlQueries delete = new SqlQueries("Delete from " + tableName + " where name = \"" + objectName + "\";");
                                delete.removeEntry();
                                informationDialog.setVisible(false);
                            } else if (confirmation == JOptionPane.NO_OPTION) {
                                informationDialog.setVisible(false);
                            }
                        }
                        else{
                            informationDialog.setVisible(false);
                        }
                    }
                    else if("constellations".equals(tableName)){
                        Constellations constellation = new Constellations();
                        constellation.setName(objectName);
                        if(constellation.objectExists(constellation.getName())){
                            int confirmation = JOptionPane.showConfirmDialog(null, "Do you really wish to delete " + objectName + "?");
                            if (confirmation == JOptionPane.YES_OPTION) {
                                SqlQueries delete = new SqlQueries("Delete from " + tableName + " where name = \"" + objectName + "\";");
                                delete.removeEntry();
                                informationDialog.setVisible(false);
                            } else if (confirmation == JOptionPane.NO_OPTION) {
                                informationDialog.setVisible(false);
                            }
                        }
                        else{
                            informationDialog.setVisible(false);
                        }
                    }
                    else if("planets".equals(tableName)){
                        Planets planet = new Planets();
                        planet.setName(objectName);
                        if(planet.objectExists(planet.getName())){
                            int confirmation = JOptionPane.showConfirmDialog(null, "Do you really wish to delete " + objectName + "?");
                            if (confirmation == JOptionPane.YES_OPTION) {
                                SqlQueries delete = new SqlQueries("Delete from " + tableName + " where name = \"" + objectName + "\";");
                                delete.removeEntry();
                                informationDialog.setVisible(false);
                            } else if (confirmation == JOptionPane.NO_OPTION) {
                                informationDialog.setVisible(false);
                            }
                        }
                        else{
                            informationDialog.setVisible(false);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Unknown error occurred.");
                    }
            });
        });

        AddButton.addActionListener(e -> {
            JDialog typeDialog = new JDialog();
            typeDialog.setSize(250, 200);
            typeDialog.setVisible(true);

            JPanel typeDialogPanel = new JPanel();
            typeDialogPanel.setLayout(null);
            JLabel panelHeading = new JLabel("Select the type of the object: -");
            JLabel typesHeading = new JLabel("Type of object: ");
            JButton select = new JButton("Select");
            JButton stop = new JButton("Cancel");
            String[] types = {"Asteroid", "Constellation", "Galaxy", "Planet", "Star"};
            JComboBox<String> typesList = new JComboBox<>(types);

            typeDialogPanel.add(typesHeading);
            typeDialogPanel.add(panelHeading);
            typeDialogPanel.add(typesList);
            typeDialogPanel.add(select);
            typeDialogPanel.add(stop);

            panelHeading.setBounds(5, 10, 200, 25);
            typesHeading.setBounds(10, 40, 100, 25);
            typesList.setBounds(110, 40, 100, 25);
            select.setBounds(15, 90, 100, 25);
            stop.setBounds(120, 90, 100, 25);
            typeDialog.add(typeDialogPanel);

            select.addActionListener(e15 -> {

                JDialog newEntryInformation = new JDialog();
                newEntryInformation.setVisible(true);
                newEntryInformation.setSize(300, 300);


                JPanel dialogPanel = new JPanel();
                dialogPanel.setLayout(null);

                String type = (String) typesList.getSelectedItem();
                if("Planet".equals(type)){
                    JLabel headingLabel = new JLabel("Enter the information about the object: -");
                    JLabel nameLabel = new JLabel("Name: -");
                    JLabel sizeLabel = new JLabel("Size: -");
                    JLabel typeLabel = new JLabel("Type: -");
                    JLabel informationLabel = new JLabel("Information: -");
                    JTextField nameTextField = new JTextField();
                    JTextField sizeTextField = new JTextField();
                    JTextField typeTextField = new JTextField();
                    JTextArea informationTextArea = new JTextArea();
                    JButton submit = new JButton("Submit");
                    JButton cancel = new JButton("Cancel");

                    dialogPanel.add(headingLabel);
                    dialogPanel.add(nameLabel);
                    dialogPanel.add(sizeLabel);
                    dialogPanel.add(typeLabel);
                    dialogPanel.add(informationLabel);
                    dialogPanel.add(nameTextField);
                    dialogPanel.add(sizeTextField);
                    dialogPanel.add(typeTextField);
                    dialogPanel.add(informationTextArea);
                    dialogPanel.add(submit);
                    dialogPanel.add(cancel);

                    headingLabel.setBounds(0, 0, 250, 50);
                    nameLabel.setBounds(10, 50, 100,20);
                    sizeLabel.setBounds(10, 70, 100, 20 );
                    typeLabel.setBounds(10, 90, 100 , 20);
                    informationLabel.setBounds(10, 110, 100 , 20);
                    nameTextField.setBounds(90, 50, 100, 20);
                    sizeTextField.setBounds(90, 70, 100, 20);
                    typeTextField.setBounds(90, 90, 100, 20);
                    informationTextArea.setBounds(90, 110, 100, 70);
                    informationTextArea.setLineWrap(true);
                    informationTextArea.setWrapStyleWord(true);
                    submit.setBounds(25, 200, 100, 30);
                    cancel.setBounds(130, 200  , 100, 30);
                    newEntryInformation.add(dialogPanel);

                    cancel.addActionListener(e15110 -> newEntryInformation.setVisible(false));
                    submit.addActionListener(e1519 -> {

                        newEntryInformation.setVisible(false);
                        String enteredName = nameTextField.getText();
                        double enteredSize = Double.parseDouble(sizeTextField.getText());
                        String enteredType = typeTextField.getText();
                        String enteredInformation = informationTextArea.getText();

                        SqlQueries insert = new SqlQueries("Insert into planets values('" + enteredName + "', " + enteredSize +", '" + enteredType + "', '" + enteredInformation + "');");
                        insert.updateTable();
                        newEntryInformation.setVisible(false);
                    });
                }
                else if("Galaxy".equals(type)){
                    JLabel headingLabel = new JLabel("Enter the information about the object: -");
                    JLabel nameLabel = new JLabel("Name: -");
                    JLabel distanceLabel = new JLabel("Distance: -");
                    JLabel typeLabel = new JLabel("Type: -");
                    JLabel informationLabel = new JLabel("Information: -");
                    JTextField nameTextField = new JTextField();
                    JTextField distanceTextField = new JTextField();
                    JTextField typeTextField = new JTextField();
                    JTextArea informationTextArea = new JTextArea();
                    JButton submit = new JButton("Submit");
                    JButton cancel = new JButton("Cancel");

                    dialogPanel.add(headingLabel);
                    dialogPanel.add(nameLabel);
                    dialogPanel.add(distanceLabel);
                    dialogPanel.add(typeLabel);
                    dialogPanel.add(informationLabel);
                    dialogPanel.add(nameTextField);
                    dialogPanel.add(distanceTextField);
                    dialogPanel.add(typeTextField);
                    dialogPanel.add(informationTextArea);
                    dialogPanel.add(submit);
                    dialogPanel.add(cancel);

                    headingLabel.setBounds(0, 0, 250, 50);
                    nameLabel.setBounds(10, 50, 100,20);
                    distanceLabel.setBounds(10, 70, 100, 20 );
                    typeLabel.setBounds(10, 90, 100 , 20);
                    informationLabel.setBounds(10, 110, 100 , 20);
                    nameTextField.setBounds(90, 50, 100, 20);
                    distanceTextField.setBounds(90, 70, 100, 20);
                    typeTextField.setBounds(90, 90, 100, 20);
                    informationTextArea.setBounds(90, 110, 100, 70);
                    informationTextArea.setLineWrap(true);
                    informationTextArea.setWrapStyleWord(true);
                    submit.setBounds(25, 200, 100, 30);
                    cancel.setBounds(130, 200  , 100, 30);
                    newEntryInformation.add(dialogPanel);

                    cancel.addActionListener(e151 -> newEntryInformation.setVisible(false));
                    submit.addActionListener(e1512 -> {

                        newEntryInformation.setVisible(false);
                        String enteredName = nameTextField.getText();
                        double enteredDistance = Double.parseDouble(distanceTextField.getText());
                        String enteredType = typeTextField.getText();
                        String enteredInformation = informationTextArea.getText();

                        SqlQueries insert = new SqlQueries("Insert into galaxies values('" + enteredName + "', " + enteredDistance +", '" + enteredType + "', '" + enteredInformation + "');");
                        insert.updateTable();
                        newEntryInformation.setVisible(false);
                    });
                }
                else if("Asteroid".equals(type)){
                    newEntryInformation.setSize(300, 400);
                    JLabel headingLabel = new JLabel("Enter the information about the object: -");
                    JLabel nameLabel = new JLabel("Name: -");
                    JLabel sizeLabel = new JLabel("Size: -");
                    JLabel orbitalPeriodLabel = new JLabel("Orbital Period: -");
                    JLabel typeLabel = new JLabel("Type: -");
                    JLabel informationLabel = new JLabel("Information: -");
                    JTextField nameTextField = new JTextField();
                    JTextField sizeTextField = new JTextField();
                    JTextField orbitalPeriodTextField = new JTextField();
                    JTextField typeTextField = new JTextField();
                    JTextArea informationTextArea = new JTextArea();
                    JButton submit = new JButton("Submit");
                    JButton cancel = new JButton("Cancel");

                    dialogPanel.add(headingLabel);
                    dialogPanel.add(nameLabel);
                    dialogPanel.add(sizeLabel);
                    dialogPanel.add(orbitalPeriodLabel);
                    dialogPanel.add(typeLabel);
                    dialogPanel.add(informationLabel);
                    dialogPanel.add(nameTextField);
                    dialogPanel.add(sizeTextField);
                    dialogPanel.add(orbitalPeriodTextField);
                    dialogPanel.add(typeTextField);
                    dialogPanel.add(informationTextArea);
                    dialogPanel.add(submit);
                    dialogPanel.add(cancel);

                    headingLabel.setBounds(0, 0, 250, 50);
                    nameLabel.setBounds(10, 50, 100,20);
                    sizeLabel.setBounds(10, 70, 100, 20 );
                    orbitalPeriodLabel.setBounds(10, 90, 100, 20 );
                    typeLabel.setBounds(10, 110, 100 , 20);
                    informationLabel.setBounds(10, 130, 100 , 20);
                    nameTextField.setBounds(100, 50, 100, 20);
                    sizeTextField.setBounds(100, 70, 100, 20);
                    orbitalPeriodTextField.setBounds(100, 90, 100, 20);
                    typeTextField.setBounds(100, 110, 100, 20);
                    informationTextArea.setBounds(100, 130, 100, 170);
                    informationTextArea.setLineWrap(true);
                    informationTextArea.setWrapStyleWord(true);
                    submit.setBounds(25, 300, 100, 30);
                    cancel.setBounds(130, 300  , 100, 30);
                    newEntryInformation.add(dialogPanel);

                    cancel.addActionListener(e1516 -> newEntryInformation.setVisible(false));
                    submit.addActionListener(e1517 -> {

                        newEntryInformation.setVisible(false);
                        String enteredName = nameTextField.getText();
                        double enteredSize = Double.parseDouble(sizeTextField.getText());
                        double enteredOrbitalPeriod = Double.parseDouble(orbitalPeriodTextField.getText());
                        String enteredType = typeTextField.getText();
                        String enteredInformation = informationTextArea.getText();

                        SqlQueries insert = new SqlQueries("Insert into asteroids values('" + enteredName + "', " + enteredSize +", '" + enteredOrbitalPeriod + "', '" + enteredType + "', '" + enteredInformation + "');");
                        insert.updateTable();
                        newEntryInformation.setVisible(false);
                    });
                }
                else if("Star".equals(type)){
                    newEntryInformation.setSize(300, 350);
                    JLabel headingLabel = new JLabel("Enter the information about the object: -");
                    JLabel nameLabel = new JLabel("Name: -");
                    JLabel sizeLabel = new JLabel("Size: -");
                    JLabel distanceLabel = new JLabel("Distance: -");
                    JLabel massLabel = new JLabel("Mass: -");
                    JLabel typeLabel = new JLabel("Type: -");
                    JLabel informationLabel = new JLabel("Information: -");
                    JTextField nameTextField = new JTextField();
                    JTextField sizeTextField = new JTextField();
                    JTextField distanceTextField = new JTextField();
                    JTextField massTextField = new JTextField();
                    JTextField typeTextField = new JTextField();
                    JTextArea informationTextArea = new JTextArea();
                    JButton submit = new JButton("Submit");
                    JButton cancel = new JButton("Cancel");

                    dialogPanel.add(headingLabel);
                    dialogPanel.add(nameLabel);
                    dialogPanel.add(sizeLabel);
                    dialogPanel.add(distanceLabel);
                    dialogPanel.add(massLabel);
                    dialogPanel.add(typeLabel);
                    dialogPanel.add(informationLabel);
                    dialogPanel.add(nameTextField);
                    dialogPanel.add(sizeTextField);
                    dialogPanel.add(distanceTextField);
                    dialogPanel.add(massTextField);
                    dialogPanel.add(typeTextField);
                    dialogPanel.add(informationTextArea);
                    dialogPanel.add(submit);
                    dialogPanel.add(cancel);

                    headingLabel.setBounds(0, 0, 250, 50);
                    nameLabel.setBounds(10, 50, 100,20);
                    sizeLabel.setBounds(10, 70, 100, 20 );
                    distanceLabel.setBounds(10, 90, 100, 20 );
                    massLabel.setBounds(10, 110, 100, 20 );
                    typeLabel.setBounds(10, 130, 100 , 20);
                    informationLabel.setBounds(10, 150, 100 , 20);
                    nameTextField.setBounds(90, 50, 100, 20);
                    sizeTextField.setBounds(90, 70, 100, 20);
                    distanceTextField.setBounds(90, 90, 100, 20);
                    massTextField.setBounds(90, 110, 100, 20);
                    typeTextField.setBounds(90, 130, 100, 20);
                    informationTextArea.setBounds(90, 150, 100, 70);
                    informationTextArea.setLineWrap(true);
                    informationTextArea.setWrapStyleWord(true);
                    submit.setBounds(25, 250, 100, 30);
                    cancel.setBounds(130, 250  , 100, 30);
                    newEntryInformation.add(dialogPanel);

                    cancel.addActionListener(e1513 -> newEntryInformation.setVisible(false));
                    submit.addActionListener(e1514 -> {

                        newEntryInformation.setVisible(false);
                        String enteredName = nameTextField.getText();
                        double enteredSize = Double.parseDouble(sizeTextField.getText());
                        double enteredDistance = Double.parseDouble(distanceTextField.getText());
                        double enteredMass = Double.parseDouble(massTextField.getText());
                        String enteredType = typeTextField.getText();
                        String enteredInformation = informationTextArea.getText();

                        SqlQueries insert = new SqlQueries("Insert into stars values('" + enteredName + "', " + enteredSize +", '" + enteredDistance + "', '" + enteredMass + "', '" + enteredType + "', '" + enteredInformation + "');");
                        insert.updateTable();
                        newEntryInformation.setVisible(false);
                    });
                }
                else if("Constellation".equals(type)){
                    JLabel headingLabel = new JLabel("Enter the information about the object: -");
                    JLabel nameLabel = new JLabel("Name: -");
                    JLabel numberOfStarsLabel = new JLabel("Number of stars: -");
                    JLabel typeLabel = new JLabel("Type: -");
                    JLabel informationLabel = new JLabel("Information: -");
                    JTextField nameTextField = new JTextField();
                    JTextField numberOfStarsTextField = new JTextField();
                    JTextField typeTextField = new JTextField();
                    JTextArea informationTextArea = new JTextArea();
                    JButton submit = new JButton("Submit");
                    JButton cancel = new JButton("Cancel");

                    dialogPanel.add(headingLabel);
                    dialogPanel.add(nameLabel);
                    dialogPanel.add(typeLabel);
                    dialogPanel.add(numberOfStarsLabel);
                    dialogPanel.add(informationLabel);
                    dialogPanel.add(nameTextField);
                    dialogPanel.add(numberOfStarsTextField);
                    dialogPanel.add(typeTextField);
                    dialogPanel.add(informationTextArea);
                    dialogPanel.add(submit);
                    dialogPanel.add(cancel);

                    headingLabel.setBounds(0, 0, 250, 50);
                    nameLabel.setBounds(10, 50, 100,20);
                    numberOfStarsLabel.setBounds(10, 70, 120 , 20);
                    typeLabel.setBounds(10, 90, 100, 20 );
                    informationLabel.setBounds(10, 110, 100 , 20);
                    nameTextField.setBounds(130, 50, 100, 20);
                    numberOfStarsTextField.setBounds(130, 70, 100, 20);
                    typeTextField.setBounds(130, 90, 100, 20);
                    informationTextArea.setBounds(130, 110, 100, 70);
                    informationTextArea.setLineWrap(true);
                    informationTextArea.setWrapStyleWord(true);
                    submit.setBounds(25, 200, 100, 30);
                    cancel.setBounds(130, 200  , 100, 30);
                    newEntryInformation.add(dialogPanel);

                    cancel.addActionListener(e1518 -> newEntryInformation.setVisible(false));
                    submit.addActionListener(e1515 -> {

                        newEntryInformation.setVisible(false);
                        String enteredName = nameTextField.getText();
                        double enteredNumberOfStars = Integer.parseInt(numberOfStarsTextField.getText());
                        String enteredType = typeTextField.getText();
                        String enteredInformation = informationTextArea.getText();

                        SqlQueries insert = new SqlQueries("Insert into constellations values('" + enteredName + "', " + enteredNumberOfStars +", '" + enteredType + "', '" + enteredInformation + "');");
                        insert.updateTable();
                        newEntryInformation.setVisible(false);
                    });
                }
            });

            stop.addActionListener(e16 -> typeDialog.setVisible(false));
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.pack();
        frame.setVisible(true);
    }
}