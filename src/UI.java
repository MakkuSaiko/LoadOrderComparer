import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import za.modTools.Data;

public class UI extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception
    {
        //Data class
        Data data = new Data();
        //Create Anchor pane
        AnchorPane pane = new AnchorPane();

        //Create left labels and text boxes
        Label lblA = new Label("LoadOrder Name and content");
        TextField txtFNameA = new TextField("Load Order Name");
        TextArea txtLoadA = new TextArea("Paste load order here...");
        //Set textbox height to 3 times the default
        txtLoadA.setMaxHeight(txtLoadA.getHeight()*-5);
        //Add to VBOX
        VBox VBA = new VBox();
        VBA.getChildren().addAll(lblA,txtFNameA,txtLoadA);
        //Add VBOX to anchorpane and anchor left
        pane.getChildren().add(VBA);
        pane.setLeftAnchor(VBA,10.0);


        //Create right labels and textboxes
        Label lblB = new Label("LoadOrder Name and content");
        TextField txtFNameB = new TextField("Load Order Name");
        TextArea txtLoadB = new TextArea("Paste load order here...");
        //Set textbox height to the same height as for the left counterpart
        txtLoadB.setMaxHeight(txtLoadA.getHeight());
        //Add to VBOX
        VBox VBB = new VBox();
        VBB.getChildren().addAll(lblB,txtFNameB,txtLoadB);
        //Add VBOX to anchorpane and anchor left
        pane.getChildren().add(VBB);
        pane.setRightAnchor(VBB,10.0);

        //Create VBOX
        VBox main = new VBox();
        main.setAlignment(Pos.CENTER);

        //Create results fields
        AnchorPane pane2 = new AnchorPane();
        TextArea txtOutA = new TextArea("Output goes here:");
        TextArea txtOutB = new TextArea("Output goes here:");

        pane2.getChildren().addAll(txtOutA,txtOutB);
        pane2.setLeftAnchor(txtOutA,10.0);
        pane2.setRightAnchor(txtOutB,10.0);

        //Create action button
        Button actionButton = new Button("Compare");
        actionButton.setMaxWidth(Double.MAX_VALUE);
        actionButton.setOnAction(event -> {
            try
            {
                data.setList1(txtLoadA.getText());
                data.setList2(txtLoadB.getText());
                data.setList1Name(txtFNameA.getText());
                data.setList2Name(txtFNameB.getText());
                data.SortLists();
                txtOutB.setText("Mods missing from " + data.list2Name + "\n" + data.showDifference(data.list1, data.list2));
                txtOutA.setText("Mods missing from " + data.list1Name + "\n" + data.showDifference(data.list2, data.list1));
            }
            catch (Exception e)
            {
                txtOutA.setText("Be sure to enter data into all fields");
                txtOutB.setText(txtOutA.getText());
            }

        });




        //Add anchorpane, Action button, and results field
        main.getChildren().addAll(pane,actionButton,pane2);
        main.setPadding(new Insets(0,0,10,0));
        stage.setTitle("Load Order Comparer");
        stage.setMinWidth(1000);
        stage.setMaxWidth(1000);
        stage.setScene(new Scene(main));
        stage.show();




    }
}
